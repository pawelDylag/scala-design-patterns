package creational

/**
  * Created by paweldylag on 22/04/2017.
  */


/**
  * Prototype for each product from one category.
  * Category is represented by unique category identifier.
  * @param categoryId category identifier
  */
class ProductPrototype(val categoryId: Long) {



  /**
    * Each product must have it's unique category id.
    * Different categories have different set of templates to show to the user.
    * @return unique category id
    */
  def getTypeId(): Long = {
    categoryId
  }

  /**
    * Builds new product from this prototype.
    * @return
    */
  override def clone(): ProductPrototype = {
    new ProductPrototype(this.categoryId)
  }

}

