package home_work

object Test6 {
  //定义一个函数，参数是一个Int类型的数组， 以数组形式返回数组中的所有奇数
  val f: (Array[Int]) => Array[Int] = (arr) => {
    val ints: Array[Int] = arr.filter(x => x % 2 == 1)
    ints
  }

  def main(args: Array[String]): Unit = {
    f(Array[Int](1, 2, 3, 4, 5)).foreach(println)
  }
}
