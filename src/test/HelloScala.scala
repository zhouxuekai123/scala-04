package test

object HelloScala {
  val f3: Int => Double = x => x * 0.1

  def add2(f: Int => Double, a: Int) = {
    f(a)
  }
val f1=(a:Int,b:Int)=>a*b
  def add3(f: (Int, Int) => Int,a:Int,b:Int) = {
    // f1(a)
    //f1(b)

    //var z=Array[Int](10,10)

    f(a,b)
  }

  def main(args: Array[String]): Unit = {
    // println(add2(x=>x*0.1,100))
    // var z=Array[Int](10,10)
    // println(add3((a,b)=>a+b,z))
    println(add3((a, b) => a + b ,40,10))
  }

}
