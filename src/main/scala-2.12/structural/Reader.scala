package structural

import scala.io.Source

/**
  * Created by paweldylag on 04/04/2017.
  */

trait Reader {
  def readNext() : String
  def hasNext() : Boolean
}


class SystemFileReader(filepath: String) extends Reader {
  var iterator = Source.fromFile(filepath).getLines()
  override def readNext(): String = {
    iterator.next()
  }

  override def hasNext(): Boolean = {
    iterator.hasNext
  }
}

class InputReader extends Reader {
  override def readNext(): String = {
    scala.io.StdIn.readLine()
  }

  override def hasNext(): Boolean = {
    true
  }
}

class UpperCaseFileReader(fileReader: SystemFileReader) extends Reader {
  override def readNext(): String = {
    fileReader.readNext().toUpperCase
  }

  override def hasNext(): Boolean = {
    fileReader.hasNext()
  }
}

class WhitespaceFileReader(fileReader: SystemFileReader) extends Reader {
  override def readNext(): String = {
    fileReader.readNext().filterNot((x: Char) => x.isWhitespace)
  }

  override def hasNext(): Boolean = {
    fileReader.hasNext()
  }
}

class UpperCaseInputReader(inputReader: InputReader) extends Reader {
  override def readNext(): String = {
    inputReader.readNext().toUpperCase
  }

  override def hasNext(): Boolean = {
    inputReader.hasNext()
  }
}

class WhitespaceInputReader(inputReader: InputReader) extends Reader {
  override def readNext(): String = {
    inputReader.readNext().filterNot((x: Char) => x.isWhitespace)
  }

  override def hasNext(): Boolean = {
    inputReader.hasNext()
  }
}
