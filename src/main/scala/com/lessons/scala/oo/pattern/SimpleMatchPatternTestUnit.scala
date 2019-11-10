package com.lessons.scala.oo.pattern

import com.lessons.scala.oo.clz.{BinOp, Expr, Number, Var}

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/10 21:18 
  */
object SimpleMatchPattenTestUnit {
  def main(args: Array[String]): Unit = {
    println(describ(BinOp("-",Number(1),Var("x"))))
    println(describ1(BinOp("-",Number(1),Var("x"))))
    println("UnOp===>")
    println(describ(UnOp("y",BinOp("-",Number(1),Var("x")))))
    println(describ1(UnOp("y",BinOp("-",Number(1),Var("x")))))
  }

  def describ(expr:Expr):String={
    expr match {
      case Number(x)=>"x"
      case Var(x)=>x;
      case e=>e.toString
    }
  }


  def describ1(expr:Expr):String={
    expr match {
      case Number(_)=>"x"
      case Var(_)=>"Var Object";
      case _=>"others"
    }
  }
}

case class UnOp(y:String,expr:Expr) extends Var(y)