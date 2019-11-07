package com.caojm.lessons.oo.clz

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/03 17:17 
  */
class ChecksumAccumulator {
  private var sum=0;

  def add(b:Byte):Unit={
//    b=b+1;  编译失败，因为方法中的参数默认是val变量
    sum +=1;
  }
}

/**
  * 伴生对象
  */
object ChecksumAccumulator{
  def main(args: Array[String]): Unit = {
    val acc = new ChecksumAccumulator;
    acc.add(2);
    acc.sum=2;  //伴生对象可以访问private字段
    println("========>")
  }

  import collection.Map.empty;
  private val cache= empty[String,Int];

  def calculate(s:String):Int={
    if(cache.contains(s)){
      cache.get(s);
    }
    0;
  }
}

/**
  * Standalone object
  */
object ChecksumAccumulatorMain{
  def main(args: Array[String]): Unit = {
    val acc = new ChecksumAccumulator;
    acc.add(2);
//    acc.sum=2;  //
    println("========>")
  }
}
