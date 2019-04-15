package day02
import scala.collection.mutable
object Test1 {
  def main(args: Array[String]): Unit = {
    val mp = Map [String ,Int]("a"->1,"b"->2)

    val mp1: mutable.Map[String, Int] = mutable.Map[String,Int]("a"->1,"b"->2)
    val mp2: Map[String, Int] = Map[String,Int](("zs",11),("ls",22))
    mp1+=(("c",3))
    mp1+=("d"->4)
    mp1("e")=5
  }


}
