package day02

object Demo1 {

  def m1(arr: Array[Int]): (Int, Int) = {
    val max: Int = arr.max
    val min: Int = arr.min
    (max, min)
  }

  def main(args: Array[String]): Unit = {
    val ints: Array[Int] = Array[Int](1, 2, 3, 4, 5)
    print(m1(ints))
  }
}