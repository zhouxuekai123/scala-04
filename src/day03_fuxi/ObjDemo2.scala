package day03_fuxi

class ObjDemo2 {
  private val nvshen: String = "bb"
}
object ObjDemo2 {
  def main(args: Array[String]): Unit = {
    new ObjDemo2().nvshen
  }
}
object ObjTest {
  def main(args: Array[String]): Unit = {
    new ObjDemo2()
  }
}

