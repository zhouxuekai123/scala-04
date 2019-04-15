package day02

object Avgtemper {
  def main(args: Array[String]): Unit = {
    val d1 = Array(("bj",28.1), ("sh",28.7), ("gz",32.0), ("sz", 33.1))
    val d2 = Array(("bj",27.3), ("sh",30.1), ("gz",33.3))
    val d3 = Array(("bj",28.2), ("sh",29.1), ("gz",32.0), ("sz", 30.5))
    val dd: Array[(String, Double)] = d1++d2++d3

    //获取map集合,根据城市分组
    val stringToTuples: Map[String, Array[(String, Double)]] = dd.groupBy(x=>x._1)

    //
    val stringToDoubles: Map[String, Array[Double]] = stringToTuples.mapValues(arr=>arr.map(tp=>tp._2))

    val result: Map[String, Double] = stringToDoubles.mapValues(arr=>(arr.sum/arr.size))

    result.foreach(println)
  }
}
