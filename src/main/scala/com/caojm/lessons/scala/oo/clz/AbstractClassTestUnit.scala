package com.caojm.lessons.scala.oo.clz

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/03 21:21 
  */
object AbstractClassTestUnit extends App {
  val other = new EmployeeOther("caojm");
  other.id_=(32772);
  println(other.id);

  val emp = new Employee("wangqi");
  emp.id_=(2222);
  println(emp.id);

  var fred = new Person("fred") { //匿名内部类
    override var id: Int = 26616
  }
  println(fred.id);
}

/**
  * 定义了只有getName方法，和一个有set和get的方法
  * @param name
  */
abstract class Person(val name:String){
  var id:Int;
}


class Employee(override val name:String)extends Person(name) {
  override var id: Int = _;
}

class Employee1(override val name:String,override var id:Int)extends Person(name)

class EmployeeOther(name:String)extends Person(name) {
  override var id: Int = _;
}


abstract class Cat{
  val dangerous=false;
}

class Tiger(override val dangerous:Boolean) extends Cat;

class Lion(override val dangerous:Boolean,val isKing:Boolean) extends Cat;