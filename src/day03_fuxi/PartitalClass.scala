package day03_fuxi

object PartitalClass {

  def  pf:PartialFunction[Any,Int]={
    case x:Int=>x*10

  }


  def main(args: Array[String]): Unit = {
    val arr: Array[Any] = Array(1,2,3,"str")
    arr.map(x => {
      x match {
        case x: Int => x * 10
        case _ => 0
      }
    })
   // result.foreach(println)

    arr.collect(pf).foreach(println)

  }

}
