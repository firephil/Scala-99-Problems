//Demonstrating light weight syntax of scala 3
package scala99
@main
def run1() = 
  val ls:List[Int] = (0 to 1000000).toList
  Timer.average(p1(ls))(5)
  Timer.average(p1_imperative(ls))(5)
  Timer.average(p1_recersive(ls))(5)

@main
def run2() = ???