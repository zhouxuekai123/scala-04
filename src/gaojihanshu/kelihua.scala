package gaojihanshu

object kelihua {
  def add(x:Int,y:Int,z:Int)=x+y+z
  def add2(x:Int)(y:Int,z:Int)=x+y+z

  def main(args: Array[String]): Unit = {
  println(add(1,2,3))
    println(add2(1)(2,3))
  }

}
