package structural

import java.io.{BufferedReader, InputStreamReader}


/**
  * Created by kprzystalski on 01/04/17.
  */

import scala.collection.JavaConverters._

trait FileReader {  def readFileContents(): String}

class FileReaderReal(filename: String) extends FileReader {
  val contents = {
    val stream = this.getClass.getResourceAsStream(filename)
    val reader = new BufferedReader(
      new InputStreamReader(
        stream
      )
    )
    try {
      reader.lines().iterator().asScala.mkString(System.getProperty("line.separator"))
    } finally {
      reader.close()
      stream.close()
    }
  }

  System.out.println(s"Finished reading the actual file: $filename")

  override def readFileContents(): String = contents
}

class FileReaderProxy(filename: String) extends FileReader {
  private var fileReader: FileReaderReal = null

  override def readFileContents(): String = {
    if (fileReader == null) {
      fileReader = new FileReaderReal(filename)
    }
    fileReader.readFileContents()
  }
}