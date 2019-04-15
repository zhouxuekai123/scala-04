package day03
class ObjDemo{
  val name ="zs"
  var age=45
  def getSong() ={
    println("忘情水")
  }


  override def toString = s"ObjDemo($getSong)"
}


object ObjDemo {
  def main(args: Array[String]): Unit = {
    val d1=new ObjDemo()
    d1.name
  }
}
