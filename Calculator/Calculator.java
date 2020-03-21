//
// Calculator.java          Author: Aidan Din
//
// Performs basic arithmetic operations
//
 
import java.util.Scanner;
 
public class Calculator
{
  public static void main (String[] args)
 {
    //program information
    System.out.prdoubleln("1 = Addition\n2 = Subtraction\n3 = Multiplication\n4 = Division\n5 = Absolute Value");
    System.out.prdoubleln("Enter the number for the corresponding operation to select which operation you'd like to do.");
    double firstNum, secondNum;

    //user interactions
    Scanner scan = new Scanner(System.in);
    int operation = scan.nextdouble();
    System.out.println("Please enter your first number (Dividend for Division)");
    firstNum = scan.nextDouble();
    if (operation != 5) {
      System.out.println("Please enter your second number (Divisor for Division)");
      secondNum = scan.nextDouble();
    } else {
      secondNum = 0;
    }
    // final answer
    System.out.prdoubleln(calc(firstNum, secondNum, operation));
    scan.close();
  }
  static double calc(double x, double y, int operation) {
    //calculate answers by operation
    if (operation == 1) {
      return x + y;
    } else if (operation == 2) {
      return x - y;
    } else if (operation == 3) {
      return x * y;
    } else if (operation == 4) {
      return x / y;
    } else if (operation == 5) {
      int abs = Math.abs(x);
      return abs;
    }
  }
}
