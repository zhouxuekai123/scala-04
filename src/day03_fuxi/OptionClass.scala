package day03_fuxi
object OptionClass {
  def main(args: Array[String]): Unit = {
    val mp: Map[String, Int] = Map("a" -> 1, "b" -> 2)
    //val maybeInt: Option[Int] = mp.get("a")
    mp.get("a")match {
      case Some(v)=>println(v)
      case None=> println(-100)
    }


  }

}
