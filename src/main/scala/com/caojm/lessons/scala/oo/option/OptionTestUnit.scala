package com.caojm.lessons.scala.option

/**
  * Option(选项)类型用来表示一个值是可选的（有值或无值)
  *
  * @author <a href=mailto:caojianmin@jd.com>caojianmin1</a>
  * @create 2019-11-07 下午3:36
  **/
object OptionTestUnit extends App {

  val sites = Map("runoob" -> "m.runoob.com", "google" -> "www.google.com");
//Option 有两个子类别，一个是 Some，一个是 None，当他回传 Some 的时候，代表这个函式成功地给了你一个 String，而你可以透过 get() 这个函式拿到那个 String，如果他返回的是 None，则代表没有字符串可以给你。
  println("sites.get( \"runoob\" ) : " +  sites.get( "runoob" )) // Some(www.runoob.com)
  println("sites.get( \"baidu\" ) : " +  sites.get( "baidu" ))  //  None


  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }
  println("show(sites.get( \"baidu\")) : " +show(sites.get( "baidu")) )
  //也可以用getOrElse来代替以上方法
  println("show(sites.get( \"baidu\")) : " +sites.getOrElse( "baidu","?") )

  //isEmpty() 方法:检测元组中的元素是否为 None，实例如下：
  println("baidu isEmpty: " + sites.get( "baidu").isEmpty );
  println("google .isEmpty: " + sites.get( "google").isEmpty);

  val  googleOpt=sites.get( "google");
  googleOpt.foreach(println);
  println(googleOpt.get)
}
