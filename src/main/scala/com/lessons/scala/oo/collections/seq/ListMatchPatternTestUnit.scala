package com.lessons.scala.oo.collections.seq

/**
  *
  * 模式匹配在List中的应用
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/07 22:47 
  */
object ListMatchPatternTestUnit {
  val fruits=List("Apple","Orange","Banana");
  val List(a,b,c) = fruits;

  //但在实践中一般都不知道fruits有多少个，这个时候可运用case class
  //此处的::表示 case class的意思
  val first :: second :: rest = fruits
}
