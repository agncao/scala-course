package com.caojm.lessons.scala.oo.func

/**
  * Created by tangweiqun on 2017/11/29.
  * 柯里化
  */
object CurryingTestUnit {
  def main(args: Array[String]): Unit = {

    //函数除了可以作为值赋值给一个变量和作为函数的参数传递之外
    //还能作为函数的返回值
    def addFunc(): Int => Int = {
      (x: Int) => x + 1
    }

    addFunc

    def plainOldSum(x: Int, y: Int) = x + y
    plainOldSum(1, 2)

    //柯里化函数(curring function)
    def curriedSum(x: Int)(y: Int) = x + y
    curriedSum(1)(2)
    //说明柯里化的过程
    def first(x: Int) = (y: Int) => x + y
    val second = first(1)
    second(2)

    //拿到柯里化函数第二个函数的应用
    val onePlus = curriedSum(1)_
    onePlus(2)
    val twoPlus = curriedSum(2)_
    twoPlus(2)

  }
}
