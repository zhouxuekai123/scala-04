package home_work

object Test7 {

  //定义一个函数，共2个参数，参数一是一个Array[Int] arr，
  // 参数二是一个Int值 b，返回arr中，比b大的数的个数
  val f:(Array[Int],Int)=>Int=(arr,b)=>{
    val ints: Array[Int] = arr.filter(x=>x>b)
    ints.length
  }

  def main(args: Array[String]): Unit = {
    println(f(Array[Int](1,2,3,4,5),2))
  }
}
