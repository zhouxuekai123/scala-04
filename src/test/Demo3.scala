package test

object Demo3 {

//val / var 函数名称 = (参数列表) =>  {函数体内容}
  val f1=(a:Int,b:Int)=>a+b
  //val /var  函数名称:(输入参数类型) => 返回值类型 = (输入参数的引用) => {函数业务逻辑}
  val f2:(Int,Int)=>Int=(x:Int,y:Int)=>x*y
  def add (f1:(Int,Int)=>Int,a:Int,b:Int) ={
    f1(a,b)
  }

  def main(args: Array[String]): Unit = {
    println(add((x,y)=>y+10,10,10))

  }



}
