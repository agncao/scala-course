package com.caojm.lessons.scala.oo.func

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/24 16:58 
  */
object ParticialAndCurryingTestUnit {
  def main(args: Array[String]): Unit = {
    val plusY=plus(3);
    println(plusY(4));
    val threePlusY1:Int=>Int=plusXY(3,_)
    println(threePlusY1(4));
  }
  def plus(x:Int)=(y:Int)=>{
    x+y
  }
  def plusXY(x:Int,y:Int):Int=x+y
}
