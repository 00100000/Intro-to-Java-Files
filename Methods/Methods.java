/* Methods.java     Author: Aidan Din
 *
 * Does different advanced mathematical functions with different methods
 */

import java.util.Scanner; //imports the scanner class

public class Methods
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in); //creates the scanner
        //asks the user what operation they'd like to use
        System.out.println("What operation would you like to use? Type in a number to use a corresponding funtion.\n1. Calculates the factorial of a number\n2. Calculates the first number in an integer\n3. Calculates if a the digits in an integer are odd\n4. Calculates if all the digits in an integer are all odd or all even\n5. Calculates if a number is the middle of two other numbers");
        //scans for the operation a user wants to use
        int operation = scan.nextInt();
        //bad input check loop
        while (operation != 5 && operation != 4 && operation != 3 && operation != 2 && operation != 1 ) {
            System.out.println("I don't recognize this input. Please try again.");
            operation = scan.nextInt();
        }
        //directs a user to a method based on what operation they wanted to complete
        if (operation == 1) {
            System.out.println("Tell us the number you'd like to get the facotiral of");
            int facOf = scan.nextInt();
            System.out.println(factorial(facOf));
        } else if (operation == 2) {
            System.out.println("Tell us the number you'd like to get the first digit of");
            int firDig = scan.nextInt();
            System.out.println(firstDigit(firDig));
        } else if (operation == 3) {
            System.out.println("Tell us a number and we'll tell you if all the digits in the number are odd");
            int oddDig = scan.nextInt();
            System.out.println(allDigitsOdd(oddDig));
        } else if (operation == 4) {
            System.out.println("Tell us a number and we'll tell you if all the digits in the number have the same odd-ness or even-ness");
            int oddEven = scan.nextInt();
            System.out.println(allDigitsSame(oddEven));
        } else {
            System.out.println("Tell us the first number"); //gets extra input for the method
            int firstNum = scan.nextInt();
            System.out.println("Tell us the second number");
            int secondNum = scan.nextInt();
            System.out.println("Tell us the third number");
            int thirdNum = scan.nextInt();
            System.out.println(hasMidpoint(firstNum, secondNum, thirdNum));
        }
    }
    public static int factorial(int n) { //finds the factorial of a number from input
        int factor = 1;
        for (int x = 1; x <= n; x++) {
            factor = factor * x;
        }
        return factor;
    }
    public static int firstDigit(int n) { //finds the first digit in a number
        if (n <= 9) {
            return n;
        }
        
        do {
        n /= 10;
        } while (n >= 10);
        return n;
    }
    public static boolean allDigitsOdd(int n) { //finds if all the digits are odd
    
    int oddNums = 0;
    if (n == 0) {
        return true;
    }

    do {
        if (int modTwo % 2 == 0)
            oddNums++;
        else
            oddNums--;
        n /= 10; 
    } while (n > 0);
    
    if (oddNums == n) {
        return true;
    } else {
        return false;
    }
        
    }
    public static boolean allDigitsSame(int n) { //finds if a number has the proper evenness or oddness
    int evenNums = 0;
    int oddNums = 0;

    do {
        if (int modTwo % 2 == 0)
            oddNums++;
        else
            evenNums++;
        n /= 10; 
    } while (n > 0);
    
    if (oddNums == n || evenNums == n) {
        return true;
    } else {
        return false;
    }
    }
    public static boolean hasMidpoint(int a, int b, int c) { //checks if a number is a midpoint of two other numbers
      if (a == (b + c) / 2) {
        return true;
      } else if (b == (a + c) / 2) {
        return true;
      } else if (c == (a + b) / 2) {
        return true;
      } else {
        return false;
      }
   }
}
