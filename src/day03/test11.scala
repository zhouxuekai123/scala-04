package day03

object test11 {
  def main(args: Array[String]): Unit = {
    //site1,,2018-03-08 11:12:22
    val str: String = "site1,,2018-03-08 11:12:22"
    val arr: Array[String] = str.split(",")
    arr.foreach(println)
    println(arr.size)
  }
}
