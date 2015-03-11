//package recursion

/**
 * Created by snudurupati on 2/27/2015.
 */
import recursion.Factorials._

object Recursion {
  def main(args: Array[String]) {
    val n = args(0).toInt
    println("the factorial of %d using plain recursion is %d".format(n, plainRecFactorial(n)))
    println("the factorial of %d using tail recursion is %d".format(n, tailRecFactorial(n)))
    println("the factorial of %d using functional style is %d".format(n, factorial(n)))

    val sumOfInts = sumx(x => x, 1, n)
    val sumOfSquares = sumx(x => x*x, 1, n)
    val sumOfCubes = sumx(x => x*x*x, 1, n)

    println("the sum of integers between 1 and %d %d".format(n, sumOfInts))
    println("the sum of squares between 1 and %d %d".format(n, sumOfSquares))
    println("the sum of cubes between 1 and %d %d".format(n, sumOfCubes))

  }

//higher-order function to calculate sum of integers, squares or cubes etc.
  def sumx(f: Int => Int, a: Int, b:Int):Int = {
    if (a>b) 0 else f(a) + sumx(f, a+1, b)
  }
}
