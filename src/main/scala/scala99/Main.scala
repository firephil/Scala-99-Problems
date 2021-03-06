//Demonstrating light weight syntax of scala 3
package scala99
@main
def run1() = 
  val ls:List[Int] = (0 to 1000000).toList
  val xs:IndexedSeq[Int] = (0 to 1000000).toIndexedSeq
  
  Timer.average(p1(ls))(5)
  Timer.average(p1_imperative(ls))(5)
  Timer.average(p1_recursive(ls))(5)
  
  // using an indexed collection is the fastest  O(1) vs O(n)
  Timer.average(p1_index(xs))(5)  

@main
def run2() = ???