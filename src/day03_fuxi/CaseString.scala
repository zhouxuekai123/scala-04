package day03_fuxi

import scala.util.Random

object CaseString {
  def main(args: Array[String]): Unit = {
    val arr: Array[String] = Array[String]("a","b","c")
    var i: Int = Random.nextInt(arr.length)
    arr(i)match{
      case "a"=>println("aaa")
      case "b"=>println("bbb")
      case _=>println("sss")
    }



  }

}
