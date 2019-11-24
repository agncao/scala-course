package com.caojm.lessons.scala.oo.pattern

/**
  * Created by tangweiqun on 2017/12/8.
  */
object SequencePatternTestUnit {
  def main(args: Array[String]): Unit = {
    //5、序列模式(Sequence patterns)
    //5.1：匹配固定长度的序列或者数组
    val v: Any = List(0, 2, 3, 4)
    v match {
      case List(0, _, third) => println("list it : " + third) //匹配含有3个元素的List，并且第一个元素等于0
      case Array(0, _, third) => println("array it : " + third)//匹配含有3个元素的Array，并且第一个元素等于0
      case _ =>
    }
    //5.2：匹配任意长度的序列或者数组
    v match {
      case List(0, _*) => println("list it")//匹配含有任意个元素的List，并且第一个元素等于0
      case Array(0, _*) => println("array it")//匹配含有任意个元素的Array，并且第一个元素等于0
      case _ =>
    }
  }
}
