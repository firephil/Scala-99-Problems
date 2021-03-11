//1. Find the last element of a list.
// package level function definition
package scala99

// using built-in functionality of scala List

def p1 (ls :List[Any]) : Any = ls.last


/* taken from scala List implementation
* https://github.com/scala/scala/blob/2.13.x/src/library/scala/collection/immutable/List.scala
* */

def p1_imperative(ls:List[Any]): Any = {
  if (ls.isEmpty) throw new NoSuchElementException("List.last")
  else {
    var these = ls
    var scout = ls.tail
    while (!scout.isEmpty) {
      these = scout
      scout = scout.tail
    }
    these.head
  }
}
