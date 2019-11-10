package com.lessons.scala.oo.pattern

import com.lessons.scala.oo.clz._

/**
  * Created by tangweiqun on 2017/12/8.
  */
object Constructor {
  def main(args: Array[String]): Unit = {
    val expr: Expr = BinOp("-", Number(0), Var("y"))
    //4、构造器模式：Constructor patterns
    //4.1：支持深度匹配，比如下面的例子不仅匹配top-level的对象BinOp，还能匹配的到深一层次的对象Number
    expr match {
      case BinOp("+", Number(0),e) => println(s"a deep match:${e}")
      case e: UnCaseClassExpr =>
      case _ =>
    }
  }
}

class UnCaseClassExpr(name: String) extends Expr
