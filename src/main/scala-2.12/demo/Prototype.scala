package demo

import creational.{NecklacePrototype, PrototypeRegistry, RingPrototype}

/**
  * Created by paweldylag on 22/04/2017.
  */
object Prototype {

  def main(args: Array[String]): Unit = {

    val prototypeRegistry = new PrototypeRegistry()
    val ringPrototype = new RingPrototype()
    val necklacePrototype = new NecklacePrototype()
    prototypeRegistry.addPrototype(ringPrototype)
    prototypeRegistry.addPrototype(necklacePrototype)

    assert(prototypeRegistry.clonePrototype(0).getTypeId() == 0)
    assert(prototypeRegistry.clonePrototype(0) != ringPrototype)
    assert(prototypeRegistry.clonePrototype(1).getTypeId() == 1)
    assert(prototypeRegistry.clonePrototype(1) != necklacePrototype)

  }
}
