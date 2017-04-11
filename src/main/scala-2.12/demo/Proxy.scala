package demo

import structural.{FileReaderProxy, FileReaderReal}

/**
  * Created by kprzystalski on 02/04/17.
  */

object Proxy {
  def main(args: Array[String]): Unit = {
//    val fileMap = Map(
//      "file1.txt" -> new FileReaderProxy("file1.txt"),
//      "file2.txt" -> new FileReaderProxy("file2.txt"),
//      "file3.txt" -> new FileReaderProxy("file3.txt"),
//      "file4.txt" -> new FileReaderReal("file4.txt")
//    )
//    System.out.println("Created the map. You should have seen file1.txt read because it wasn't used in a proxy.")
////    System.out.println(s"Reading file1.txt from the proxy: ${fileMap("file1.txt").readFileContents()}")
////    System.out.println(s"Reading file3.txt from the proxy: ${fileMap("file3.txt").readFileContents()}")
  }
}
