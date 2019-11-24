package com.caojm.lessons.scala.oo.clz

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/03 22:20 
  */
object ElementFactory {

  //这样继承也可以，构造器里与抽象类的同名变量
  private class ArrayElement(val content:Array[String]) extends Element

  private class LineElement(s: String) extends ArrayElement(Array(s)) {
    override def width = s.length
    override def height = 1

  }

  //定义工厂方法:把类设置为private，这样客户端只能通过工厂方法来生成类
  def createElement(content:Array[String]):Element=new ArrayElement(content);

  def createElement(s: String):Element=new LineElement(s);

  def main(args: Array[String]): Unit = {
    val element = createElement(Array("wangwangwang","caojm","miaomiao"));
    println(element.width());
  }
}
