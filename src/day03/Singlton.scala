package day03
class Singlton private {

}
object Singlton {
//定义一个实例
  var s:Singlton=null

  def apply(): Singlton = {
    if (s==null) s=new Singlton()
    s
  }

}

object Test{
  def main(args: Array[String]): Unit = {
  val s1=Singlton.apply()
  val s2=Singlton()
  val s3=Singlton()

    println(s1,s2,s3)

  }
}
