/**
 * An implementation of finding the GCD of two numbers
 *
 * <p>Time Complexity ~O(log(a + b))
 *
 * @author William Fiset, william.alexandre.fiset@gmail.com
 */
package com.williamfiset.algorithms.math;

public class GCD {

  // Computes the Greatest Common Divisor (GCD) of a & b
  // This method ensures that the value returned is non negative
  //
  // Explanation: dividing a by b yields a quotient q and a remainder r,
  // which is equal to (a - bq); i.e. a can be written as
  // a = bq + r
  // a = bq + (a - bq)
  // let k be a common divisor of a and b, and divide the above equation by k:
  // a/k = bq/k + (a - bq)/k
  // Since a/k and bq/k are both integers, (a - bq)/k, which is r/k, must also
  // be an integer, i.e. the common divisor of a and b must also be a divisor
  // of r, the remainder of a/b.
  // Accordingly, gcd(a, b) = gcd(b, r) = gcd(b, a % b)
  public static long gcd(long a, long b) {
    return b == 0 ? (a < 0 ? -a : a) : gcd(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println(gcd(12, 18)); // 6
    System.out.println(gcd(-12, 18)); // 6
    System.out.println(gcd(12, -18)); // 6
    System.out.println(gcd(-12, -18)); // 6

    System.out.println(gcd(5, 0)); // 5
    System.out.println(gcd(0, 5)); // 5
    System.out.println(gcd(-5, 0)); // 5
    System.out.println(gcd(0, -5)); // 5
    System.out.println(gcd(0, 0)); // 0
  }
}
