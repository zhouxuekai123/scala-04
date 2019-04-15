package day03_fuxi

import scala.util.Random

object CaseClass {
  case class Register(workId:String,pass:String)
  case class HeartBeat(time:Long)
  case object CheckStatues
  def main(args: Array[String]): Unit = {
    val arr=Array(Register("zs","123"),Register("ls","456"),HeartBeat(1000),CheckStatues)
    val i: Int = Random.nextInt(arr.length)
    arr(i)match {
      case Register(a,b)=>println(a,b)
      case HeartBeat(a)=>println(a)
      case CheckStatues=>println("case object")
    }
  }

}
