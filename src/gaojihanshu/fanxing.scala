package gaojihanshu

abstract class fanxing[T](msg:T) {
def getMsg():T=msg
}
class StrMsg(msg:String) extends fanxing(msg)

object StrMsg{
  def main(args: Array[String]): Unit = {
    val m1: StrMsg = new StrMsg("xxxx")
    println(m1.getMsg())
  }
}

class Cloths[T1,T2](size:T1,color:T2)
//Enumeration枚举
object colorTypes extends  Enumeration{
  val RED,BLACK,YELLO=Value
}
object Clothstest{
  def main(args: Array[String]): Unit = {
    val c1: Cloths[String, String] = new Cloths[String,String]("122","black")

new Cloths[Int,colorTypes.Value](120,colorTypes.BLACK)
  }
}
