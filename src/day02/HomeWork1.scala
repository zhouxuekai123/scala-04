package day02

import scala.collection.mutable

object HomeWork1 {
  def main(args: Array[String]): Unit = {
    val lst = List("Id1-The Spark", "Id2-The Hadoop", "Id3-The Spark")
    //1 对集合切割lis1中有三个元素,是三个数组
    val lst1: List[Array[String]] = lst.map(x => x.split("-"))

    //2 对lst1进行切割,遍历三个元素,就是遍历三个数组,分别对三个数组进行操作
    val lst2: List[(mutable.Buffer[String], String)] = lst1.map(arr => (arr(1).split(" ").toBuffer, arr(0)))
    //println(lst2)---->List((ArrayBuffer(The, Spark),Id1), (ArrayBuffer(The, Hadoop),Id2), (ArrayBuffer(The, Spark),Id3))
    //3 压平和map操作 wordcount中的组装操作
    val lst3: List[(String, String)] = lst2.flatMap(tp => tp._1.map(a => (a, tp._2)))
    // println(lst3) ---->List((The,Id1), (Spark,Id1), (The,Id2), (Hadoop,Id2), (The,Id3), (Spark,Id3))

    //4定义一个用来装结果的可变Map集合
    val resultMap: mutable.Map[String, String] = mutable.Map[String, String]()

    //5 把结果放入到结果集合中
    lst3.map(tp=>{
      resultMap.put(tp._1,resultMap.getOrElse(tp._1,"")+tp._2+" ")
    })
    //6元组拼成字符串,并转成List集合
    val list: List[String] = resultMap.map(a=>a._1+"-"+a._2).toList
    // println(list)
    list.foreach(println)
  }

}
