package com.caojm.lessons.scala.oo.func

/**
  * Created by tangweiqun on 2017/11/29.
  */
object Parameters {
  def main(args: Array[String]): Unit = {
    //1、repeated parameter 不定长参数
    echo()
    echo("one")
    echo("hello", "world")
    //不定长参数的类型其实是Array，
    // 但是将Array的一个对象传给不定长参数的时候，需要做特殊处理，要不然编译器会报错
    val arr = Array("What's", "up", "doc?")
    echo(arr: _*)

    //2、named argument 使用参数名字来给参数设置值
    speed(100, 10) //distance = 100, time = 10
    speed(distance = 100, time = 10)
    speed(time = 10, distance = 100)

    //3、default parameters value 默认参数值
    printTime()
    printTime(Console.err)
    //默认参数值与named argument配合的很好
    printTime2(out = Console.err)
    printTime2(divisor = 1000)
  }

  def echo(args: String*) =
    for (arg <- args) println(arg)

  def speed(distance: Float, time: Float): Float =
    distance / time

  def printTime(out: java.io.PrintStream = Console.out) =
    out.println("time = " + System.currentTimeMillis())

  def printTime2(out: java.io.PrintStream = Console.out,
                 divisor: Int = 1) =
    out.println("time = " + System.currentTimeMillis()/divisor)
}
