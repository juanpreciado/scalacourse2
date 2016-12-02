package funsets

object testJuan {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet")
  
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  type Set = Int => Boolean;$skip(256); 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: funsets.testJuan.Set, elem: Int)Boolean""");$skip(85); val res$0 = 
  
  //def setTest (element: Int): Set = element > 0
  contains(elem => elem > 0, 1);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(39); val res$1 = 
  
  contains(elem => (_ == elem),  1);System.out.println("""res1: <error> = """ + $show(res$1))}

  
  
  	
}
