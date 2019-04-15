package day02

object Demo2 {
  //2，给定方法，参数是一个数组，返回一个新的数组
  //功能： Array[Int](1,3,5,76,8,9)  对数组中的元素两两交换
  //Array[Int](1,3,5,76,8,9) –》  Array(3,1,76,5,9,8)
  def m1(arr: Array[Int]): Array[Int] = {
    for (i <- 0 to arr.length - 1-1 by 2){
      var tmp=arr(i)
      arr(i)=arr(i+1)
      arr(i+1)=tmp
    }
    arr
  }

  def main(args: Array[String]): Unit = {
    print(m1(Array[Int](1,2,3,4,5,6,7,8)).toBuffer)
  }

}
