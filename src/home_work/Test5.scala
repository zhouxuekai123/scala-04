package home_work

object Test5 {
  //定义一个函数，参数是一个Boolean类型的数组，返回数组中值为true的元素的个数
  val f: (Array[Boolean]) => Int = (arr) => {
    var i: Int = 0
    for (a <- arr) {
      if (a == true) {
        i += 1
      }
    }
    i
  }

  def main(args: Array[String]): Unit = {
    println(f(Array[Boolean](false,true,true,false,true)))
  }
}
