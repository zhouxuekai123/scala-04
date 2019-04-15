package day03_fuxi

class Person private[day03_fuxi](val name: String, var age: Int) {
  var acc: String = ""

  private[day03_fuxi]def this() = {
    this("aa", 11)
  }

  def this(name: String, age: Int, acc: String) {
    this(name, age)
    this.acc = acc
  }

  override def toString = s"Person($name, $age,$acc)"
}

object Person {
  def main(args: Array[String]): Unit = {
    //默认有空参的构造方法
    val p1: Person = new Person()
    println(p1)
    val p2: Person = new Person("bq", 30)
    p2.age = 22
    println(p2.name + p2.age)
    println(p2)
    println(s"name=${p2.name},age=${p2.age}")
    val p3: Person = new Person("cc", 11, "acc")
    println(s"name=${p3.name},age=${p3.age},acc=${p3.acc}")
    println(p3)
  }
}
