# 集合类的大致结构
![集合类图谱](https://img-blog.csdn.net/20170528205649796?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYml0Y2FybWFubGVl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast "集合类图谱")

scala的源码，可以对应到上面的这幅继承关系图
![集合类源码继承图谱](https://img-blog.csdn.net/20170528210018311?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvYml0Y2FybWFubGVl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast "集合类图谱")

根据图以及源码可以很清晰地看出scala中的集合类可以分为三大类： 
1.Seq，是一组有序的元素。 
2.Set，是一组没有重复元素的集合。 
3.Map，是一组k-v对。