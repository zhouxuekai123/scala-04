package day03_fuxi

import scala.util.Random

object TpyeClass {
  def main(args: Array[String]): Unit = {
    val arr:Array[Any]=Array(1,2.2,true,"str")
    val i: Int = Random.nextInt(arr.length)
    arr(i)match{
      case x:Int=>println(s"int=${x}")
      case x:Double=>println(s"double=${x}")
      case x:Boolean=>println(s"boolean=${x}")
      case x:String=>println(s"string=${x}")
    }

  }


}
