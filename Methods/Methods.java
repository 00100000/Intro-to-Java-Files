//
// Methods.java     Author: Aidan Din
//
// Does different advanced mathematical functions with different methods
//

import java.util.Scanner;

public class Methods
{
  public static void main (String[] args) {
  
    System.out.println(factorial(5)); //120
    System.out.println(firstDigit(54832975)); //5
    System.out.println(allDigitsOdd(13579)); //true
    System.out.println(allDigitsSame(66666)); //true
    System.out.println(hasMidpoint(3, 5, 7)); //true
  
  }
  public static int factorial(int n) {
  // returns factorial
    int ret = 1;
      for (int i = 1; i <= n; i++) {
        ret *= i;
      }
    return ret;
  }
  public static int firstDigit(int n) {
  // returns first digit of an integer
    while (n >= 10) {
      n /= 10;
    }
    return n;
  }
  public static boolean allDigitsOdd(int n) {
  // returns true if all digits are odd
    while (n >= 10) {
      if (n % 2 == 0) {
        return false;
      }
      n /= 10;
    }
    return true;
  }
  public static boolean allDigitsSame(int n) {
  // returns true if all digits are the same
    int def = firstDigit(n);
    //def = default, but default is a keyword :(
    while (n >= 10) {
      if (n != def) {
        return true;
      }
      n /= 10;
    }
    return false;
  }
  public static boolean hasMidpoint(int a, int b, int c) {
  // returns true if any of the numbers are midpoints
    // Handy method for handling midpoints without
    // using doubles
    // Thanks PatheticMustan!
    if (a + b == c + c) return true;
    if (b + c == a + a) return true;
    if (c + a == b + b) return true;
    return false;
  }
}