# 集合类的大致结构
![集合类图谱](https://img-blog.csdn.net/20170528205649796?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYml0Y2FybWFubGVl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast "集合类图谱")

scala的源码，可以对应到上面的这幅继承关系图
![集合类源码继承图谱](https://img-blog.csdn.net/20170528210018311?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYml0Y2FybWFubGVl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast "集合类图谱")

根据图以及源码可以很清晰地看出scala中的集合类可以分为三大类： 
1.Seq，是一组有序的元素。 
2.Set，是一组没有重复元素的集合。 
3.Map，是一组k-v对。

##Seq分析
Seq主要由两部分组成：IndexedSeq与LinearSeq。现在我们简单看下这两种类型。

首先看IndexedSeq，很容易看出来这种类型的主要访问方式是通过索引，默认的实现方式为vector。
```
  def test() = {
    val x = IndexedSeq(1,2,3)
    println(x.getClass)
    println(x(0))   //通过索引
 
    val y = Range(1, 5)
    println(y)
  }
```
将以上函数运行起来以后，输出如下
```
class scala.collection.immutable.Vector
1
Range(1, 2, 3, 4)
```
而作为LinearSeq，主要的区别在于其被分为头与尾两部分。其中，头是容器内的第一个元素，尾是除了头元素以外剩余的其他所有元素。LinearSeq默认的实现是List。


```  def sum(seq:LinearSeq[Int]):Int={
       var total:Int = seq.head;
       if(!seq.tail.isEmpty) {
         total +=sum(seq.tail); //用head和tail来遍历 :tail of seq is: List(2,3)
       }
       total
     }
```