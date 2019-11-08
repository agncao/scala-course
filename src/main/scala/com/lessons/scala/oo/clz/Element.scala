package com.caojm.lessons.oo.clz

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/03 19:39 
  */
abstract class Element {
  def content :Array[String];
  //当函数没有括号时val也可以用来定义函数，但是此时类也会把它当做成员变量
  //也就是类初始化的时候就会分配空间
//  val content :Array[String];

  def height():Int=content.length

  //返回值类型写不写都一样，都会推断出来的
//  def height()=content.length

  def width():Int={
    var max=0;
    content.foreach(x=>{max=if(x.length>max) x.length else max});
    max;
  }
}

class ArrayElement(arr:Array[String]) extends Element{
  override def content: Array[String] = arr;

  //用val来override也是可以的
//  override val content: Array[String] = arr;
}

//这样继承也可以，构造器里与抽象类的同名变量
class Array1Element(val content:Array[String]) extends Element

object Element{
  def main(args: Array[String]): Unit = {
    val arrEle=new ArrayElement(Array("caojm","wangqi","cao"));
    println(arrEle.width());
    println(arrEle.height());
  }
}