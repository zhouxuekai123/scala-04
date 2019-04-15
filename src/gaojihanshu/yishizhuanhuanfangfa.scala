package gaojihanshu

import java.io.File

import scala.io.Source


class Yishizhuanhuanfangfa(f: File) {
  //f返回文件的所有内容
  def read(): String = {
    Source.fromFile(f).getLines().mkString("\r\n")

  }


}

object Yishizhuanhuanfangfa {
//  implicit def aaa(f: File): Yishizhuanhuanfangfa = {
//    println("method---")
//    new Yishizhuanhuanfangfa(f)
//  }

  implicit val ff = (f: File) => {
    println("function---")
    new Yishizhuanhuanfangfa(f)

  }


  def main(args: Array[String]): Unit = {
    val file: File = new File("d:/wc.txt")
    //返回文件的多有内容
    val result2: String = file.read()
    println(result2)
    // val result: String = new Yishizhuanhuanfangfa(file).read()
    //println(result)

  }
}
