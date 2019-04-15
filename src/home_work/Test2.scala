package home_work

object Test2 {

  def Avg(a: Int*): Double = {
    a.sum * 1.0 / a.size
  }

  def main(args: Array[String]): Unit = {
    println(Avg(1, 2, 3, 4))
  }

}
