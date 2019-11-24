package com.caojm.lessons.scala.oo.pattern

/**
  * 数组泛型跟java一样不会类型擦除，其他如List、Map、Set等泛型会类型擦除
  * Created by tangweiqun on 2017/12/8.
  */
object TypedPatternTestUnit {
  def main(args: Array[String]): Unit = {
    //7、类型模式(Typed patterns)
    generalSize("abc") //res16: Int = 3
    generalSize(Map(1 -> 'a', 2 -> 'b')) //res17: Int = 2
    generalSize(math.Pi) //res18: Int = -1

    //7.1 typed patterns 相当于type tests 和 type casts
    //下面的代码在scala中一点都不提倡
    def generalSize(x: Any) = {
      if (x.isInstanceOf[String]) {
        val s = x.asInstanceOf[String]
        s.length
      } else if (x.isInstanceOf[Map[_, _]]) {
        val m = x.asInstanceOf[Map[_, _]]
        m.size
      } else {
        -1
      }
    }

    def generalSizeWithPattern(x: Any) = x match {
      case s: String => s.length
      case m: Map[Int, Int] => m.size   //如果传入Map[Int,String]这种类型也一样能匹配，因为在JVM中类型给擦除了
      case _ => -1
    }

    //7.2 类型擦除
    isIntIntMap(Map(1 -> 1)) //true
    isIntIntMap(Map("abc" -> "abc")) //true

    isStringArray(Array("abc")) //yes
    isStringArray(Array(1, 2, 3)) //no
  }

  def isStringArray(x: Any) = x match {
    case a: Array[String] => "yes" //数组是个例外，因为数组在java中是特殊处理了，在scala中也是特殊处理了，在jvm中对应着不同类型的数组，比如int[], float[]等
    case _ => "no"
  }

  def isIntIntMap(x: Any) = x match {
    case m: Map[_, _] => true //类型被擦除了
    case _ => false
  }

}
