package day03
class Person  (val name:String,var age:Int){
  println("this is  main constructor-------------")
  var acc = ""
  // 插值法打印
  override def toString = s"Person($name, $age,$acc)"
  // 空参的辅助构造器
  def this()={
    // 第一行 必须调用主构造器 或者其他的辅助构造器
    //    this(name,age) // 主构造器先实例化，主构造器的参数必须初始化赋值，再实例化辅助构造器 ；
    this("aa",22)
    println("fz  xxx")
  }
  def this(name:String,age:Int,acc:String)={
    //    this()
    this(name,age)
    this.acc = acc
  }
  println("this is  main constructor......")
}



object Person {
  def main(args: Array[String]): Unit = {
    //val p3 = new Person("xz",40,"xz.zhibfb.com")
    //println(p3)

   //val bq = new Person("ss",48)
   // println(bq)

    val abs= new Person()
    //println(abs)
  }


}
