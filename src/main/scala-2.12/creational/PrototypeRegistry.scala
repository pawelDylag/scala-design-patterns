package creational

/**
  * Created by paweldylag on 22/04/2017.
  */
class PrototypeRegistry {

  val registry = new java.util.HashMap[Long,ProductPrototype]

  def addPrototype(productPrototype: ProductPrototype): Unit = {
    registry.put(productPrototype.getTypeId(), productPrototype)
  }

  def clonePrototype(categoryId: Long): ProductPrototype = {
    val prototype = registry.get(categoryId)
    if (prototype != null) {
      prototype.clone()
    } else {
      throw new IllegalArgumentException("There is no prototype for category id " + categoryId)
    }
  }

}
