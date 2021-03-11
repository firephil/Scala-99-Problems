//1. Find the last element of a list.

package scala99

import scala.annotation.tailrec

// using built-in functionality of scala List

def p1 [A](ls: List[A]): A = ls.last


/* Imperative solution taken from scala List implementation
* https://github.com/scala/scala/blob/2.13.x/src/library/scala/collection/immutable/List.scala
* */

def p1_imperative[A](ls: List[A]): A= {
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

// The standard functional approach is to recurse down the list until we hit
// the end.  Scala's pattern matching makes this easy.
@tailrec
def p1_recersive[A](ls: List[A]): A = ls match {
  case h :: Nil  => h
  case _ :: tail => p1_recersive(tail)
  case Nil         => throw new NoSuchElementException //only for empty lists
}
