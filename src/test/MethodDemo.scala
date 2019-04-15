package test

object MethodDemo {

  def sum(a: Int, b: Int): Int = a + b

  def m1 = 100

  def m2() = 200

  def m3(a: Int, b: Int): Int = {
    return a + b + 10
  }

  def mul(i: Int): Int = {
    if (i <= 1) 1 else i * mul(i - 1)
  }

  def mut (i:Int*)={
    //以最后一行的结果为返回值
    i.sum
    i.min
    i.max
  }
  def main(args: Array[String]): Unit = {
    /*val i1: Int = MethodDemo.sum(10,20)
    val i2: Int = sum(1,2)
    println(i2)*/
   /*println(m2())
    println(m2)
    println(m1)
    println(m3(1, 1))
    println(mul(3))
*/
 println(mut(1,2,3,4))


  }

}
