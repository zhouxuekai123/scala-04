package day03_fuxi

class Singleton private{
}
object Singleton{

    var s: Singleton =null

    def apply(): Singleton = {
      if(s==null) s=new Singleton()
      s
    }


}

object  TestDemo{
  def main(args: Array[String]): Unit = {
  val s1=Singleton.apply()
  val s2=Singleton()
  val s3=Singleton()
    println(s1,s2,s3)

  }
}