package functional

/**
  * Created by kprzystalski on 02/04/17.
  */
trait Monoid[T] {
  def op(l: T, r: T): T
  def zero: T
}
