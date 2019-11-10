package com.lessons.scala.oo.pattern

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/10 22:01 
  */
object ConstMatchTestUnit {
  def main(args: Array[String]): Unit = {
    val emptyList=List();
    println(constMath(emptyList))
  }

  def constMath(x:Any):String ={
    x match {
      case _:Int => "int value"
      case _:Boolean=>"boolean value"
      case Nil=>"empty list"
      case _=>"else";
    }
  }

}
