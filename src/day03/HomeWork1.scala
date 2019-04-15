package day03

import scala.collection.{immutable, mutable}
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object HomeWork1 {
  def main(args: Array[String]): Unit = {
    //site1,user1,2018-03-01 02:12:22
    //site1,user2,2018-03-05 04:12:22
    //site1,user2,2018-03-05 04:13:22
    //s  ,user2,2018-03-05 04:14:22
    //site1,user2,2018-03-05 04:15:22
    //site4,user7,
    //结果 site1,2018-03-01,5,2
    val strings: Iterator[String] = Source.fromFile("F:\\四期java学习视频\\辉哥视屏\\day05-scala-03\\pvuv\\pvuv.txt").getLines()
    val list1: List[String] = strings.toList //每条数据作为集合的一个元素
    val list2: List[String] = list1.filter(str => str.length > 30) //去除脏数据

    //list2.foreach(println)
    val list3: List[mutable.Buffer[String]] = list2.map(str => {
      str.split(",").toBuffer
    })
    val list4: List[(String, String, String)] = list3.map(arr => (arr(0), arr(1), arr(2).slice(0, 10)))
    // list4.foreach(println)---//(site1,user2,2018-03-05)

    //根据 site1  2018-03-05两个字段进行分组
    val map: Map[(String, String), List[(String, String, String)]] = list4.groupBy(str => (str._1, str._3))
    //value是list集合,元素个数是pv  去重后的不同用户数就是uv
    val resultMap: Map[(String, String), (Int, Int)] = map.mapValues(ls => {
      val user: List[String] = ls.map(tp => tp._2)
      val pv: Int = user.length
      val uv: Int = user.distinct.length
      (pv, uv)
    })
    //对最终的结果进行拼装  site3,2018-03-05,3,1
    //val result: immutable.Iterable[String] = resultMap.map(a=>a._1._1+","+a._1._2+","+a._2._1+","+a._2._2)
    val result: List[String] = resultMap.map(a => a._1._1 + "," + a._1._2 + "," + a._2._1 + "," + a._2._2).toList
    //对结果进行排序
    val result1: List[String] = result.sortBy(str => str)
    result1.foreach(println)


  }

}
