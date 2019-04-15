package test

object Demo2 {
  def m1(x:Int,y:Double) = {
    if(x>y) x.toDouble
    else y
  }
  def  m2(f:(Int,Double) => Double,x:Int,y:Double) = f(x,y)
  def main(args: Array[String]): Unit = {
  println(m2( m1,1,5))
    println(m1 _,1,5)
    println(m2((a,b)=>(if(a>b)a.toDouble else b),1,5))
  }


}
