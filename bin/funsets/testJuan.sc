package funsets

object testJuan {
  println("Welcome to the Scala worksheet")
  
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)
  
  //def setTest (element: Int): Set = element > 0
  contains(elem => elem > 0, 1)
  
  contains(elem => (_ == elem),  1)

  
  
  	
}