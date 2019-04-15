package day03

import scala.collection.mutable
import scala.io.Source

object HomeWork2 {
  //2017-08-14,涛哥,共享女友,360应用,北京,v1.0
  //2017-08-14,赵老师,共享女友,安智市场,北京,v1.2
  //2017-08-14,涛哥,共享女友,360应用,天津,v1.2
  def main(args: Array[String]): Unit = {
    //读数据
    val list: List[String] = Source.fromFile("F:\\四期java学习视频\\辉哥视屏\\day05-scala-03\\scala-day03\\练习\\appupgrade.txt").getLines().toList
    //list.foreach(println)
    //切分数据,转可变数组
   val list1: List[mutable.Buffer[String]] = list.map(str=>str.split(",").toBuffer)
    //list1.foreach(println)//ArrayBuffer(2017-08-14, 涛哥, 共享女友, 360应用, 北京, v1.0)
    //对数据进行处理,并且去除里面的ArrayBuffer
    val list2: List[(String, String, String, String, String)] = list1.map(arr=>(arr(0),arr(1),arr(2),arr(3),arr(5)))
    //map.foreach(println)
    //对数据进行分组
   val map: Map[(String, String, String, String), List[(String, String, String, String, String)]] = list2.groupBy(arr=>(arr._1,arr._2,arr._3,arr._4))
    // map.foreach(println)//((2017-08-14,涛哥,共享女友,360应用),List((2017-08-14,涛哥,共享女友,360应用,v1.0), (2017-08-14,涛哥,共享女友,360应用,v1.2)))
     //对数据进行聚合操作
     val resultMap: Map[(String, String, String, String), List[String]] = map.mapValues(ls => {
       val arr1: List[String] = ls.map(tp => tp._5)
       val arr: List[String] = arr1.sortBy(x=>x)
       arr
     })
    //对结果进拼装,排序
    val result1: List[((String, String, String, String), List[String])] = resultMap.toList
    val result2: List[String] = result1.map(str=>(str._1._1+","+str._1._2+","+str._1._3+","+str._1._4+","+str._2.mkString(","))).sortBy(x=>x)
    result2.foreach(println)


    //resultMap.foreach(println)

  }

}
