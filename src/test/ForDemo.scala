package test

object ForDemo {

  def main(args: Array[String]): Unit = {
    /* val arr:Array[Int]=Array(11,22,33,44,55)
     for(v <- arr) println(v)*/

    //val ints: Array[Int] = Array(11,12,13,14)
    /*val strings: Array[String] = Array("a","b","c")
    for (v <- strings)println(v)*/
    val arr: Array[Int] = Array(1, 2, 3, 4)
    /*for (i<- 0 to arr.length-1 by 1 ) println(arr(i))
    println("---------")
    for(i <- 1 until 3) println(arr(i))*/
    //嵌套for循环
    /*for(i<- 1 to 3 ;j<-1 until 3 if(i!=j)) {
      print(i*10+j+" ")*/
    //守卫模式
    // for(a <-arr if(a%2==0))println(a)
    //yield
    //yield 推导式
    /*val res: Array[Int] = for (a <- arr) yield a*10
    res.foreach(println)
    val booleans: Array[Boolean] = for(a<- arr)yield a%2==0
    booleans.foreach(println)*/

    //函数式编程
    //arr.filter(a => a % 2 == 0).foreach(println)
    /*val ints: Array[Int] = arr.map(a => a * 10)
    ints.foreach(println)*/
   // arr.map(a=>a*100).foreach(println)
    //for (i<- arr.length-1 to 0 by -1) println(arr(i))
    println(1 to 100 by 10)
    println(1 until 100 by 10)
    println(1 until 10)

  }


}
