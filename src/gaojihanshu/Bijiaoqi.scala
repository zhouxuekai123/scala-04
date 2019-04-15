package gaojihanshu

import java.util
import java.util.Collections

class Bijiaoqi {
}

class Person(val name:String,val age:Int)extends Ordered[Person]{
  override def compare(that: Person): Int = {
    this.age-that.age
  }

  override def toString = s"Person($name, $age)"
}
object Person{
  def main(args: Array[String]): Unit = {
    val pList: util.ArrayList[Person] = new util.ArrayList[Person]()
    val p1: Person = new Person("a1", 18)
    val p2: Person = new Person("a2", 11)
    val p3: Person = new Person("a3", 28)
    pList.add(p1)
    pList.add(p2)
    pList.add(p3)

    Collections.sort(pList,new Ordering[Person] {
      override def compare(x: Person, y: Person): Int = {
        x.age-y.age
      }
    })
    import scala.collection.JavaConversions._
    for(p<-pList){
      println(p)
    }

    val tp:Any = ("1a",101)
    println(tp.asInstanceOf[(String,Int)]._1)
  }
}
