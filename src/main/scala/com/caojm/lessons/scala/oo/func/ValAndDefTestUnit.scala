package com.caojm.lessons.scala.oo.func

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/24 14:08 
  */
object ValAndDefTestUnit {
  def main(args: Array[String]): Unit = {
    basicFunc(2);
    println(literalFunc1(2));
    println(literalFunc2(2));
  }

  /**
    * 用javap看看最基本的方法和本地方法
    */
  def basicFunc(x: Int): Int = {
    def localFunc() = {
      println("localFunc:=>" + x)
    }

    localFunc()
    println("basicFunc")
    2 * x
  }

  def literalFunc1:Int=>Int=(x:Int)=>{
    2 * x
  }

  val literalFunc2:Int=>Int=(x:Int)=>{
    2 * x
  }

  def literalFunc3:Int=>Int={
    2 * _
  }
}
