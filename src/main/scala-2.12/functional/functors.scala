package functional

/**
  * Created by kprzystalski on 02/04/17.
  */
trait Functor[F[_]] {
  def map[T, Y](l: F[T])(f: T => Y): F[Y]
}

