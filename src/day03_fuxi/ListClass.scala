package day03_fuxi

object ListClass {
  def main(args: Array[String]): Unit = {
    val ints: List[Int] = List(1,2,3)
    ints match{
      //case List(x,y,z)=>println(s"x=${x},y=${y},z=${z}")
      //case x::y::z=>println(s"x=${x},y=${y},z=${z}")
      case x::y=>println(s"x=${x},y=${y}")
    }
  }

}
