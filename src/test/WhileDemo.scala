package test

object WhileDemo {
  def main(args: Array[String]): Unit = {

    var flag=true
    var i=0
    while(flag){
      if(i>=5 ){
        flag=false
      }
      println("你好吗,我很好"+i)
      i+=1

    }

  }

}
