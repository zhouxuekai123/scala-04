package day02

object WordCount {
  def main(args: Array[String]): Unit = {

    val arr: Array[String] = Array[String]("hello jim jim jim sorry dorry","hello tom tom tom sorry","hello tom sory")
    //拆分
    val words: Array[String] = arr.flatMap(x=>x.split(" "))
    //组装
    val wordone: Array[(String, Int)] = words.map(x=>(x,1))
    //分组
    val stringToTuples: Map[String, Array[(String, Int)]] = wordone.groupBy(x=>x._1)
    //聚合
    val result: Map[String, Int] = stringToTuples.mapValues(arr => {
      val ints: Array[Int] = arr.map(tp => tp._2)
      ints.sum
    })
    result.foreach(println)


  }

}
