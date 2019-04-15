package test

import scala.io.StdIn
import scala.util.Random

object Demo1 {

  def avg(array: Array[Int]): Double = {
    array.sum * 1.0 / array.length
  }

  def main(args: Array[String]): Unit = {
     val ints: Array[Int] =  Array[Int](1,2,3,4)
    println(avg(Array[Int](1,2,3,4)))




    val num: Int = Random.nextInt(100)
    println(num)
    var flag = true
    while (flag) {
      println("随机数生成完毕,请输入1-100的数字")
      val i: Int = StdIn.readInt()
      if (i == num) {
        flag = false
      }
    }
    println("恭喜答对了")
  }

}
