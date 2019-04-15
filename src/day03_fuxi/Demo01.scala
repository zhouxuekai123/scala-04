package day03_fuxi


object Demo01{
  //apply方法的重载
  def apply():Int = 100
  def apply(x:Double):Double = x
  def main(args: Array[String]): Unit = {
    //正常方法的调用
    println(Demo01.apply())
    println(Demo01.apply(10D))
    //方法的简写
    println(Demo01())
    println(Demo01.apply(10D))
  }
}
