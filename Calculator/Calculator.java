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
    System.out.println("1 = Addition\n2 = Subtraction\n3 = Multiplication\n4 = Division\n5 = Absolute Value");
    System.out.println("Enter the number for the corresponding operation to select which operation you'd like to do.");

    //user interactions
    Scanner scan = new Scanner(System.in);
    int operation = scan.nextInt();
     
    if (operation == 1) {
    } else if (operation == 2) {
    } else if (operation == 3) {
    } else if (operation == 4) {
    } else if (operation == 5) {
    }
  }
}
