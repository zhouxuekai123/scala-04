package test

object IfDemo {
  def main(args: Array[String]): Unit = {


    val score = 100;
    val res = if (score > 90) {
      score
    } else {
      0
    }

    val res2 = if (score > 90) {
      score
      println("1111") //Unit ()
    } else {
      0
    }

    val res3 = if (score > 90) {
      score
      println("2222")
    } else {
      ""
    }

    println(res2)

    val res4:AnyVal=if(score>190){
      score
    }else{
      ()
    }

    var res5:AnyRef="nihao";


  }
}