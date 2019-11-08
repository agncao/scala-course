package com.caojm.lessons.oo.clz

import scala.beans.BeanProperty

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/03 20:49 
  */
class BeanPropertyTestUnit {
  @BeanProperty var name:String=_;
  var age:Int=_;
  private[this] var sex:Int=0;
}

object BeanPropertyTestUnit{
  def main(args: Array[String]): Unit = {
    //BeanProperty标注了的字段会生成：name:String,name_=(name:String):Unit,
    // getName():String,setName():Unit 4个方法
    val testUnit = new BeanPropertyTestUnit;
    testUnit.name_=("cao");
    println(testUnit.name);

    testUnit.name="caojm";
    println(testUnit.name);

    testUnit.setName("wangqi");
    println(testUnit.getName);


    //没有BeanProperty标注了的字段没有java那样的get和set方法
    testUnit.age_=(3);
    println(testUnit.age);

//    testUnit.sex=1; //连半生类也不能访问
  }
}