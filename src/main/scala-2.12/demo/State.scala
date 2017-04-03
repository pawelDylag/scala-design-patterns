package demo

import behavioral.MediaPlayer

/**
  * Created by kprzystalski on 02/04/17.
  */
object State {
  def main(args: Array[String]): Unit = {
    val player = MediaPlayer()

    player.pressPlayOrPauseButton()
    player.pressPlayOrPauseButton()
    player.pressPlayOrPauseButton()
    player.pressPlayOrPauseButton()
  }
}
