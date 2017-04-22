package behavioral

import java.io.File


/**
  * Created by paweldylag on 22/04/2017.
  */
trait FileParser {
  def parse(file: File): ParseResult
}

class ParseResult(val name: String,
                  val data: String) {
}

class SuperCleverFileParserOnlyForSuperUsers extends FileParser {

  override def parse(file: File): ParseResult = {
    if (file.getName.endsWith(".json")) {
      new JsonParser().parse(file)
    } else if (file.getName.endsWith(".csv")){
      new CsvParser().parse(file)
    } else {
      throw new IllegalArgumentException("Unable to parse file " + file.getName)
    }
  }
}

class JsonParser extends FileParser {

  override def parse(file: File): ParseResult = {
    // damn, I won't implement the whole parsing, it's just a waste of time.
    // you get the whole idea!
    println("JsonParser is doing it's ultra tough job to parse yet another JSON file...")
    println("It's absolutely not a dummy parsing. No need to think about it. Proceed.")
    new ParseResult("json", "json")
  }

}

class CsvParser extends FileParser {

  override def parse(file: File): ParseResult = {
    // damn, I won't implement the whole parsing, it's just a waste of time.
    // you get the whole idea!
    println("CSV Parser is doing it's ultra tough job to parse yet another CSV file...")
    println("It's absolutely not a dummy parsing. No need to think about it. Proceed.")
    new ParseResult("csv", "csv")
  }

}