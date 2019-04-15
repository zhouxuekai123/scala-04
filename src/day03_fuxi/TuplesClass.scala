package day03_fuxi

object TuplesClass {

  def main(args: Array[String]): Unit = {
    val tuple: (String, Int) = ("a",10)
    tuple match{
      case (k,v)if(v>11)=>println((k,v))
      case _ =>println("aa")
    }



  }

}
