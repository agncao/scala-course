package com.lessons.scala.oo.pattern

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/10 21:45 
  */
object SealedClassTestUnit {

  def main(args: Array[String]): Unit = {
    //当你在用模式匹配的时候，你肯定需要考虑所有场景的case，有的时候我们可以用default来代替所有没有考虑到的情况
    //但是有的时候这个默认值没有意义，这个时候怎么来保证你能考虑到所有的情况呢？

    //我们让编译器来帮我们考虑，我们可以在case class的父类上加一个sealed的关键字，这个sealed会帮我们做两件事情：
    //1：在我们定义模式匹配的时候，如果没有考虑全场景，编译器会报警告

    //2：被sealed修饰的类，不能被在其他文件中的case class继承
  }

  def describ(expr: Expr1): String = {
    expr match {
      case Number1(x) => "x"
      case Var1(x) => x;
      //      case e=>e.toString  //
    }
  }
}

sealed abstract class Expr1

case class Number1(num:Double) extends Expr1

case class Var1(name:String) extends Expr1

case class BinOp1(operator:String,left:Number,right:Var1) extends Expr1