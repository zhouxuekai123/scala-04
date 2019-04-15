package day03

import scala.collection.mutable
import scala.io.Source

object HomeWork11 {
  def main(args: Array[String]): Unit = {
    val strings: Iterator[String] = Source.fromFile("F:\\四期java学习视频\\辉哥视屏\\day05-scala-03\\pvuv\\pvuv.txt").getLines()
    //数据转成list集合
    val list1: List[String] = strings.toList
    //过滤脏数据
    val list2: List[String] = list1.filter(str=>str.length>30)
    //对每条数据进行切割
     val list3: List[mutable.Buffer[String]] = list2.map(str=>str.split(",").toBuffer)
    //把时间的字段进行处理 2018-03-05 04:15:22-->2018-03-05 04
    val list4: List[(String, String, String)] = list3.map(arr=>(arr(0),arr(1),arr(2).slice(0,13)))
    //对数据进行分组,根据site1  018-03-05 04分组
    val map: Map[(String, String), List[(String, String, String)]] = list4.groupBy(x=>(x._1,x._3))
    //map.foreach(println)
    //对map的value进行操作,获取pv和uv值
    val resultmap: Map[(String, String), (Int, Int)] = map.mapValues(ls => {
      val arr: List[String] = ls.map(tp => tp._2)
      //(pv,uv)
      (arr.length, arr.distinct.length)
    })
    //对结果数据进行拼接,排序
    val result: List[String] = resultmap.toList.map(t=>(t._1._1+","+t._1._2+","+t._2._1+","+t._2._2)).sortBy(x=>x)
    result.foreach(println)



  }

}
