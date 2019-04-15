package home_work

object Test8 {
  //定义一个方法，共2个参数，参数一是一个函数，
  // 参数二是一个Array[Int]，方法返回Array[Int]。
  // 功能是能对数组中的每一个元素执行某一项操作，返回一个新的数组
  //数组的赋值改值方式：
  //arr(0)=100
  //arr(1)=90

  def mut(f: (Array[Int]) => Array[Int], arr: Array[Int]): Array[Int] = {
    f(arr)
  }

  def main(args: Array[String]): Unit = {
    mut(a => a.map(x => x * 100), Array[Int](1, 2, 3)).foreach(println)
  }
}
