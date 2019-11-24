package com.caojm.lessons.scala.oo.pattern

import com.caojm.lessons.scala.oo.clz.Var


/**
  * Created by tangweiqun on 2017/12/8.
  */
object VariableBinding {
  def main(args: Array[String]): Unit = {
    val expr = UnOp("abs", UnOp("abs", Var("x")))
    expr match {
      case UnOp("abs", e@UnOp("abs", i@Var(_))) => println(e + " " + i)
      case _ =>
    }
  }
}
