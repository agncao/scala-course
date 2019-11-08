package com.caojm.lessons.oo.collections

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/04 23:05 
  */
object SeqTestUnit extends App{
  val digits = List(4);
  println(s"digits.head:${digits.head}");
  println(s"digits.tail:${digits.tail}");

  val digits2=6::1::digits ;
  println(s"digits.head:${digits2.head}");  //digits.head:6
  println(s"digits2.tail:${digits2.tail}"); //digits2.tail:List(1, 4)

  val digists3=2::1::Nil;
  println(s"digists3.head:${digists3.head}"); //digists3.head:2
  println(s"digists3.tail:${digists3.tail}"); //digists3.tail:List(1)

  val empty=List(); //empty: List[Nothing] = List();
  val lst1:List[Int] = empty; //Nothing 是任何类型的子类,List又是协变的，所以 List[Nothing]当然也是List[Int]类型的子类，所以这样没有任何问题的
  println(s"empty:${empty}");
  println(s"empty list is empty:${empty.isEmpty}");


  //递归
  def sum(list: List[Int]):Int={
    if(list==Nil) 0 else list.head+sum(list.tail)
  }

  println(s"sum function:${sum(List(9,2,4,6))}")

  val fruits = "Apple" :: ("Orange"::("Banana"::Nil))
  println(s"fruits:${fruits}")

}
