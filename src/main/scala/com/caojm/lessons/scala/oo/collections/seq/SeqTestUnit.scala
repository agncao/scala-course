package com.caojm.lessons.scala.oo.collections.seq

import scala.collection.immutable.LinearSeq

/**
  * ${DESCRIPTION}
  *
  * @author <a href=mailto:caojianmin@jd.com>caojianmin1</a>
  * @create 2019-11-07 下午4:50
  **/
object SeqTestUnit {
  def testIndexSeq() = {
    val x = IndexedSeq(1, 2, 3)
    println(x.getClass)
    println(x(0))

    val y = Range(1, 5)
    println(y)

  }

  def testLinearSeq() = {
    val x = LinearSeq(1, 2, 3)
    val head =x.head

    println(s"${head} is head");
    println(s"${x.tail} is tail");

  }

  def sum(seq:LinearSeq[Int]):Int={
    var total:Int = seq.head;
    if(!seq.tail.isEmpty) {
      total +=sum(seq.tail);
    }
    total
  }

  def main(args: Array[String]): Unit = {
    testIndexSeq();
    testLinearSeq();
  }
}
