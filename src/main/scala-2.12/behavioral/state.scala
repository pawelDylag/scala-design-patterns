package behavioral

/**
  * Created by kprzystalski on 02/04/17.
  */

trait State[T] {
  def press(context: T)
}

class Playing extends State[MediaPlayer] {
  override def press(context: MediaPlayer): Unit = {
    System.out.println("Pressing pause.")
    context.setState(new Paused)
  }
}

class Paused extends State[MediaPlayer] {
  override def press(context: MediaPlayer): Unit = {
    System.out.println("Pressing play.")
    context.setState(new Playing)
  }
}

case class MediaPlayer() {
  private var state: State[MediaPlayer] = new Paused

  def pressPlayOrPauseButton(): Unit = {
    state.press(this)
  }

  def setState(state: State[MediaPlayer]): Unit = {
    this.state = state
  }
}