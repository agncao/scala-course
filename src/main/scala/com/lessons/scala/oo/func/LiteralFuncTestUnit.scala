package com.lessons.scala.oo.func

/**
  * ${DESCRIPTION}
  *
  * @author <a href=mailto:caojianmin@jd.com>caojianmin1</a>
  * @create 2019-11-11 下午2:32
  **/
object LiteralFuncTestUnit extends App {
  //1、function literal(函数字面量)
  //在编译的时候function literal是一个class，但是在运行时的时候是一个object(称之为function value)
  x:Int =>x+1;

  //2、既然function value是对象，那么就可以将function value赋值给一个变量
  val increase=(x:Int) =>x+1;
  var incr:(Int=>Int)=x=>x+1;
  var incr1:Function[Int,Int]=x=>x+1


  //3、函数可以作为函数的参数进行传递
  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.foreach((x: Int) => println(x))
  val func = (x: Int) => x > 0
  someNumbers.filter(func)

  someNumbers.foreach(println _)

  println(someNumbers);
}
