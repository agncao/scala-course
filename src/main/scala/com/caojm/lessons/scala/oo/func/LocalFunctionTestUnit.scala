package com.caojm.lessons.scala.oo.func

import scala.io.Source

/**
  * ${DESCRIPTION}
  *
  * @author <a href=mailto:caojianmin@jd.com>caojianmin1</a>
  * @create 2019-11-11 下午2:00
  **/
object LocalFunctionTestUnit {
  def main(args: Array[String]): Unit = {
    val filename= "/Users/caojianmin/books/notes/老汤课程/[老汤]微职位：Scala语言的学习/函数式编程基础课件源代码-01/scala-func/src/main/scala/com/twq/func/basic/Closures.scala"
    LongLines.processFile(filename,-1)
  }
}

object LongLines{
  def processFile(filename:String,width:Int): Unit ={
    val source = Source.fromFile(filename)
    for(line <- source.getLines()){
      processLine(line);
    }
    def processLine(line:String): Unit ={
      if (line.length > width)
        println(line.trim)
    }
  }
}