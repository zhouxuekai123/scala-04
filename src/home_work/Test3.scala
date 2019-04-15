package home_work

object Test3 {


  val f:(Array[Int])=>Double=(arr)=>{
    arr.sum*1.0/arr.length
  }

  def main(args: Array[String]): Unit = {
    println( f(Array[Int](1,2,3,4)))
  }
}
