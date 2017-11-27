import org.scalatest.{FlatSpec, Matchers}

class SumSpec extends FlatSpec with Matchers {

  "A Sum" should "add two numbers" in {
    sum(3 :: 4 :: Nil) should be(7)
  }

  it should "any collection of numbers" in {
    sum(3 :: 4 :: 2 :: Nil) should be(9)
  }

  def sum(xs: List[Int]): Int = xs.foldLeft(0)(_ + _)
}
