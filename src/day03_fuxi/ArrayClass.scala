package day03_fuxi

object ArrayClass {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1,2,3)
    arr match{
      case Array(x,y,1)=>println(s"x=${x},y=${y}")
      case Array(1,2,z)=>println(s"1,2,z=${z}")
    }

  }

}
