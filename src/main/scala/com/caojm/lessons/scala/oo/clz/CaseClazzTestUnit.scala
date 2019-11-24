package com.caojm.lessons.scala.oo.clz

/**
  *
  * 创建case class对象，不需要new，自带apply
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/07 23:19 
  */
object CaseClazzTestUnit {
  //2: 用case修饰的Class 我们称之为Case Class。编译器看到这个case修饰的class，会为这个class加一些额外的特性：

  //2.1、编译器会为Case Class增加一个以类名为名字的工厂方法，这个工厂方法作用是构建这个类的对象
  val x = Var("x");
  val op=BinOp("+",Number(1),x);
  //2.2、编译器默认的为case class的值参数加上了val来进行修饰，所以这些值参数和一个类里的域一样
  println(x.name);

  //2.3、编译器自动为case class添加了toString、hashCode以及equals方法
  println(op)
  //可以用 == 来比较case class，比较case class的类型以及case class中的值参数
  op.right == Var("x")

  //2.4、编译器为case class增加了一个copy方法，使得case class的值参数的值可以修改
  //如果一个case class中只要几个特定的值参数需要改变的话，用copy比较方便
  val opNew = op.copy(operator = "-")

  //3、case 除了可以修饰class，还可以修饰object，就是表示一个单例对象

  //4、case class最大的优点就是配合模式匹配

}

//1: 如果一个类的类体是空的话，我们可以将{}去掉
abstract class Expr

case class Number(num:Double) extends Expr

case class Var(name:String) extends Expr

case class BinOp(operator:String,left:Number,right:Var) extends Expr