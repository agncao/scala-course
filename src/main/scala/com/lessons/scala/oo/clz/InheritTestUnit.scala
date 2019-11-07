package com.caojm.lessons.oo.clz

/**
  *
  * ${DESCRIPTION} 
  *
  * @author <a href="mailto:caojianmin@jd.com">caojianmin</a>
  * @create 2019/11/03 21:46 
  */

object InheritTestUnit {
  def main(args: Array[String]): Unit = {

  }

  class Person (name: String){
    private var age=0;
    private var sex=0;

    def this(name: String,age:Int){
      this(name);
      this.age=age;
    }
    def this(name: String,age:Int,sex:Int){
      this(name,age);
      this.sex=sex;
    }
  }

}

