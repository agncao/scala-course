package com.lessons.scala.oo.pattern

import com.lessons.scala.oo.clz._


/**
  * Created by tangweiqun on 2017/11/22.
  */
object PatternsGuards {
  def main(args: Array[String]): Unit = {
    //x * 2
    BinOp("*",Number(2), Var("x"))

  }

  def guard(s: Any) = s match {
    case n: Int if 0 < n =>
    case s: String if s(0) == 'a' =>
  }

  //pattern overlaps
  def simplifyBad(expr: Expr): Expr = expr match {
    case UnOp(op, e) => UnOp(op, simplifyBad(e))
    case UnOp("-", UnOp("-", e)) => e //unreachable code
  }
}
