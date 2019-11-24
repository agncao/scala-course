package com.caojm.lessons.scala.oo.func

import scala.annotation.tailrec


/**
  * Created by tangweiqun on 2017/11/29.
  * 尾递归
  *
  */
object TailRecursion {
  def main(args: Array[String]): Unit = {
    //求两个整数的公因数
        //栈帧
    //while loop
    def gcdLoop(x: Long, y: Long): Long = {
      var a = x
      var b = y
      while (a != 0) {
        val temp = a
        a = b % a
        b = temp
      }
      b
    }
    //尾递归
    @tailrec
    def gcd(x: Long, y: Long): Long =
      if (y == 0) x else gcd(y, x % y)


    //1、while循环和递归
    //递归：更函数式、简洁以及没有var，但是函数的调用可能会消耗点时间
    //while循环是命令式编程，可能会更高效的，因为没有方法的调用
    //但是如果是尾递归的话，编译器是会优化的，其效率和while循环是一样的

    //2、什么是尾递归呢？如果调用自身方法的动作是函数体的最后一个动作的话，那么这个递归就是一个尾递归
    //下面的这个不是尾递归，因为调用自身函数后还做了+1的动作
    @tailrec
    def boom(x: Int): Int =
      if (x == 0) throw new Exception("boom!")
      else boom(x - 1)

    //3、可以使用注解tailrec来标志是否为尾递归

    //4、尾递归的编译器优化
    //scalac
    //javap -c来看反汇编之后的指定代码

    //5、尾递归的限制，以下递归，不会进行尾递归优化，因为jvm的指令集使得尾递归的优化受限
    //递归调用的函数不是函数体所在的函数
    def isEven(x: Int): Boolean =
      if (x == 0) true else isOdd(x - 1)
    def isOdd(x: Int): Boolean =
      if (x == 0) false else isEven(x - 1)

  }

  //while循环
  def approximateLoop(initialGuess: Double): Double = {
    var guess = initialGuess
    while (!isGoodEnough(guess))
      guess = improve(guess)
    guess
  }

  //递归
  //编译器会将尾递归翻译成while循环
  @tailrec
  def approximate(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else approximate(improve(guess))


  private def isGoodEnough(guess: Double): Boolean = guess == 3.0

  private def improve(guess: Double): Double = guess + 1
}
