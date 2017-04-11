package demo

import structural.{InputReader, Reader, FileReader, WhitespaceFileReader, WhitespaceInputReader, UpperCaseFileReader, UpperCaseInputReader}
/**
  * Created by paweldylag on 04/04/2017.
  */
object Decorator {

  var FILE = "file2.txt";

  def main(args: Array[String]): Unit = {
   var fileReader = new FileReader(FILE)
   var whitespaceFileReader = new WhitespaceFileReader(fileReader)
   var upperCaseFileReader = new UpperCaseFileReader(fileReader)
    while (fileReader.hasNext()) {
      System.out.println("FileReader: " + fileReader.readNext())
    }
    while (whitespaceFileReader.hasNext()) {
      System.out.println("WhiteSpaceFileReader: " + whitespaceFileReader.readNext())
    }
    while (upperCaseFileReader.hasNext()) {
      System.out.println("UppercaseFileReader: " + upperCaseFileReader.readNext())
    }
  }
}
