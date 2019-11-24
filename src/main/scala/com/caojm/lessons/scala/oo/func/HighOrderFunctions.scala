package com.caojm.lessons.scala.oo.func



/**
  * Created by tangweiqun on 2017/11/29.
  */
object HighOrderFunctions {
  def main(args: Array[String]): Unit = {
    //高阶函数(high-order functions)就是用函数作为参数的函数

    //1、高阶函数可以减少冗余代码

    //2、高阶函数可以使得客户端代码简洁
    containsNeg(List(1, 2, 3, 4))
    containsNeg(List(1, 2, -3, 4))

  }

  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }

  //方法exists是一个控制抽象，是一个带有明确目的的循环控制结构，而不是scala内置的while或者for
  //使得客户端的代码简洁
  def containsNegWithExists(nums: List[Int]) = nums.exists(_ < 0)
  def containsNegWithExists1(nums: List[Int]) = nums.exists((num) =>num< 0)

  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
  }

  def containsOddWithExists(nums: List[Int]) = nums.exists(_ % 2 == 1)
}

object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  def filesRegex(query: String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file
}

object FileMatcherNew {
  private def filesHere = (new java.io.File(".")).listFiles

  //利用高阶函数减少冗余代码，如过是java的话，就需要新建一个接口，然后是一大堆的匿名内部类
  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName))
      yield file

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesEnding1(query: String) =
    filesMatching((fileName)=>fileName.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))

}

