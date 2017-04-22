package demo

import java.io.File

import behavioral.SuperCleverFileParserOnlyForSuperUsers

/**
  * Created by paweldylag on 22/04/2017.
  */
object Strategy {

  def main(args: Array[String]): Unit = {

    // given
    val jsonfile = new File("parseMeOhParseMe.json")
    val csvFile = new File("parseMeOhParseMe.csv")

    // when
    val parser = new SuperCleverFileParserOnlyForSuperUsers()

    // then
    assert(parser.parse(jsonfile).name.compare("json") == 0)
    assert(parser.parse(csvFile).name.compare("csv") == 0)

    println("Congratulations! You won! All parsing done. Boom! Magic! Blackout! The end.")
  }

}
