package recursion

/**
 * Created by snudurupati on 3/11/2015.
 */
object currying {

  //gives powers of two
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2* powerOfTwo(x - 1)

  //curried sum function
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }

  val sumInts = sum(x => x)
  val sumSquares = sum(x => x* x)
  val sumPowersOfTwo = sum(powerOfTwo)

  def tailRecSum(f: Int => Int)(a: Int, b: Int): Int = {
    def iter(a: Int, result: Int): Int = {
      if (a > b) result
      else iter(a + 1, f(a) + result)
    }
    iter(a, 0)
  }

}
