package home_work

object Test4 {

  val f:(Array[Double])=>Double=(arr)=>{
    arr.max
  }
  def main(args: Array[String]): Unit = {
    println(f(Array[Double](1.2,2.3,3.4,4.5)))
  }
}
