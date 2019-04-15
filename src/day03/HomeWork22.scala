package day03

import scala.collection.{immutable, mutable}
import scala.io.Source

object HomeWork22 {

    //2017-08-14,涛哥,共享女友,360应用,北京,v1.0
    //2017-08-14,赵老师,共享女友,安智市场,北京,v1.2
    //2017-08-14,涛哥,共享女友,360应用,天津,v1.2
    def main(args: Array[String]): Unit = {
      //读数据
      val list: List[String] = Source.fromFile("F:\\四期java学习视频\\辉哥视屏\\day05-scala-03\\scala-day03\\练习\\appupgrade.txt").getLines().toList
      //list.foreach(println)
      //切分数据,转可变数组
      val list1: List[mutable.Buffer[String]] = list.map(str => str.split(",").toBuffer)
      //list1.foreach(println)//ArrayBuffer(2017-08-14, 涛哥, 共享女友, 360应用, 北京, v1.0)
      //对数据进行处理,并且去除里面的ArrayBuffer
      val list2: List[(String, String, String, String, String)] = list1.map(arr => (arr(0), arr(1), arr(2), arr(3), arr(5)))
      //map.foreach(println)
      //对数据进行分组
      val map: Map[(String, String, String, String), List[(String, String, String, String, String)]] = list2.groupBy(arr => (arr._1, arr._2, arr._3, arr._4))
      // map.foreach(println)//((2017-08-14,涛哥,共享女友,360应用),List((2017-08-14,涛哥,共享女友,360应用,v1.0), (2017-08-14,涛哥,共享女友,360应用,v1.2)))
      //对数据进行聚合操作
      val resultMap: Map[(String, String, String, String), List[String]] = map.mapValues(ls => {
        val arr1: List[String] = ls.map(tp => tp._5)
        val arr: List[String] = arr1.sortBy(x => x)
        arr
      })
      val resultA: Map[(String, String, String, String), List[String]] = resultMap.filter(arr=>arr._2.length<=2)
      val resultB: Map[(String, String, String, String), List[String]] = resultMap.filter(arr=>arr._2.length>2)

      val resultB1: List[List[((String, String, String, String), (String, String))]] = resultB.map(tp => {
        val ss: List[(String, String)] = tp._2 zip tp._2.tail
        val sss: List[((String, String, String, String), (String, String))] = ss.map(a => (tp._1, a))
        sss
      }).toList
      val resultB2: List[((String, String, String, String), (String, String))] = resultB1.flatten//压平
      val resultA1: List[((String, String, String, String), List[String])] = resultA.toList
      //resultB2.foreach(println)
     // resultA1.foreach(println)
      val resultB3: List[String] = resultB2.map(str=>(str._1._1+","+str._1._2+","+str._1._3+","+str._1._4+","+str._2._1+","+str._2._2))
      val resultA3: List[String] = resultA1.map(str=>(str._1._1+","+str._1._2+","+str._1._3+","+str._1._4+","+str._2.mkString(",")))
      val resultSS: List[String] = resultB3++resultA3

     resultSS.foreach(println)

    }


}