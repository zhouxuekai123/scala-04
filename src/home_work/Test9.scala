package home_work

object Test9 {

  def main(args: Array[String]): Unit = {
    //print(1+" ")//1和2特殊直接打印,1不是素数
    print(2+" ")
    for (i <- 3 to 100) {//循环遍历[3-100]的所有数
      var count: Int = 0
      for (a <- 2 until i) {//循环遍历[20-i)的所有数,就是遍历的2到i-1(除去了1和他本身)
        if (i % a != 0) { //如果取余数不等于0,说明不能被整除,count加一
          count += 1
        }
        if (count == (i - 2)) {//如果count==i-2,说明[2-i)所有数都不能整除
          print(i + " ")//打印该数
        }

      }
    }


  }

}
