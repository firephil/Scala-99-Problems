import org.junit.Test
import org.junit.Assert._
import scala99._

class Test1 {
  @Test def t1(): Unit = {
    assertEquals(3,p1(List(1,2,3)))
    assertEquals("String List",p1(List("this","is","a","String List")))
    assertEquals("String List",p1_imperative(List("this","is","a","String List")))
  }
}