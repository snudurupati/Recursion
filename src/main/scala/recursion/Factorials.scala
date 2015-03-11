package recursion

/**
 * Created by snudurupati on 3/2/2015.
 */
object Factorials {
//  factorial with plain recursion
  def plainRecFactorial(n: Int): Int =
      if (n == 0) 1
      else n*factorial(n-1)

//  factorial with tail recursion
  def tailRecFactorial(n: Int): Int = {
    def factorial(x: Int, result: Int): Int =
      if (x == 0) result
      else factorial(x - 1, result * x)
    factorial(n, 1)
  }

//  factorial using functional style
  def factorial(n: Int): Int = 1 to n reduce(_*_)
}
