package com.caojm.lessons.scala.oo.func

/**
  * Created by tangweiqun on 2017/11/28.
  */
object Closures {
  def main(args: Array[String]): Unit = {
    //1、闭包
    var more = 1
    val addMore = (x: Int) => x + more //函数捕获一个自由变量而变成一个闭包
    addMore(10)

    val add =  (x: Int) => x + 1 //不需要捕获自由变量，称之为closed term闭项

    //2、当自由变量的值改变的时候，会怎样呢？
    more = 9999
    addMore(10)//答案是闭包对自由变量的改变也是可以捕获的到的

    //当自由变量在闭包中改变，在外部自由变量也是可以感受的到的
    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    var sum = 0
    someNumbers.foreach(sum +=  _)
    println(sum)

    //3、每次调用函数的时候都产生一个新的闭包
    def makeIncr(more: Int) = (x: Int) => x + more
    val inc1 = makeIncr(1)
    val inc9999 = makeIncr(9999)

    def printArgs(args:Array[String]):Unit={
      for(arg<-args)println(arg)
    }

    val printlnArgs1 = (args:Array[String])=>args.foreach(println );
  }
}
