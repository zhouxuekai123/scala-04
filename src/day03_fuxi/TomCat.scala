package day03_fuxi

class TomCat extends Animal {
  override def sleep(): Unit = {
    println("tom cat sleeping")
  }
}
object TomCat{
  def main(args: Array[String]): Unit = {
    val cat: TomCat = new TomCat()
    cat.sleep()
    val cat2: Animal = new TomCat()
    cat2.sleep()

  }
}
