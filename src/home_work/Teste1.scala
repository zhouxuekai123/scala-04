package home_work

object Teste1 {

  val f1: (Int, Int, Int) => Int = (a: Int, b: Int, c: Int) => {
    if (a >= b && a >= c) {
      a
    } else {
      if (b >= c) {
        b
      } else {
        c
      }
    }
  }


  def main(args: Array[String]): Unit = {
    println(f1(1, 2, 3))
  }
}
