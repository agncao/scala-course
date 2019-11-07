package com.lessons.collections

/**
  * ${DESCRIPTION}
  *
  * @author <a href=mailto:caojianmin@jd.com>caojianmin1</a>
  * @create 2019-11-07 下午4:50
  **/
object IndexedSeqTestUnit {
  def test() = {
    val x = IndexedSeq(1, 2, 3)
    println(x.getClass)
    println(x(0))

    val y = Range(1, 5)
    println(y)

  }

  def main(args: Array[String]): Unit = {
    test();
  }
}