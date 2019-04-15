package day03_fuxi

class ClassDemo {
  val name = "zs"
  var age = 11

  def getsong() = {
    println("忘情水")
  }


  //override def toString = s"ClassDemo($name, $age)"
  override def toString = s"ClassDemo($name, $age, $getsong)"
}

object ClassDemo {
  def main(args: Array[String]): Unit = {
    val d1: ClassDemo = new ClassDemo()
    d1.age=100
    //d1.name=""  报错
    println(d1)

  }
}
