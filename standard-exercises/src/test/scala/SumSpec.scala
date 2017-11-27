import org.scalatest.{FlatSpec, Matchers}

class SumSpec extends FlatSpec with Matchers {

  "A Sum" should "add two numbers" in {
    sum(3 :: 4 :: Nil) should be(7)
  }

  it should "add any collection of numbers" in {
    sum(3 :: 4 :: 2 :: Nil) should be(9)
  }

  it should "add any collection of strings" in {
    sum("hola" :: " y " :: "adios" :: Nil) should be("hola y adios")
  }

  trait Monoid[A] {
    def mappend(a1: A, a2: A): A
    def mzero: A
  }

  object Monoid {
    implicit val IntMonoid: Monoid[Int] = new Monoid[Int] {
      def mappend(a: Int, b: Int): Int = a + b
      def mzero: Int = 0
    }
  
    implicit val StringMonoid: Monoid[String] = new Monoid[String] {
      def mappend(a: String, b: String): String = a + b
      def mzero: String = ""
    }
  }

  def sum[A: Monoid](xs: List[A]): A = {
    val m = implicitly[Monoid[A]]
    xs.foldLeft(m.mzero)(m.mappend)
  }
}
