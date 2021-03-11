import org.junit.Test
import org.junit.Assert._

import scala99._

class Test1 {
  @Test def t1(): Unit = {
    assertEquals(3, p1(List(1, 2, 3)))
    assertEquals(3, p1_imperative(List(1, 2, 3)))
    assertEquals(3, p1_recersive(List(1, 2, 3)))
  }
  @Test def t2(): Unit = {
    assertEquals(100,p1((1 to 100).toList))
    assertEquals(100,p1_imperative((1 to 100).toList))
    assertEquals(100,p1_recersive((1 to 100).toList))
  }
}
