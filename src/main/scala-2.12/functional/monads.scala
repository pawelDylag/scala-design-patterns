package functional

/**
  * Created by kprzystalski on 02/04/17.
  */



//trait Monad[T] extends Functor[T] {
//
//  def unit[Y](value: Y): Monad[Y]
//
//  def flatMap[Y](f: T => Monad[Y]): Monad[Y]
//
//  override def map[Y](f: T => Y): Monad[Y] =
//    flatMap(i => unit(f(i)))
//}

case class Doer() {
  def getAlgorithm(isFail: Boolean) =
    if (isFail) {
      null
    } else {
      Algorithm()
    }
}

case class Algorithm() {
  def getImplementation(isFail: Boolean, left: Int, right: Int): Implementation =
    if (isFail) {
      null
    } else {
      Implementation(left, right)
    }
}

case class Implementation(left: Int, right: Int) {
  def compute: Int = left + right
}
