package gaojihanshu

object yinshicanshu {

//implicit  val a=10
  implicit  val b=9.9
  def add(x:Int,y:Int)=x+y
  def add2(x:Int)(implicit y:Int=100)=x+y
  def add3(x:Int)(implicit y:Int=100,z:Double=100)=x+y*z
  def main(args: Array[String]): Unit = {

    println(add(10,10))
    println(add2(10)(10))
    println(add2(10))
    println(add3(10))

  }

}
