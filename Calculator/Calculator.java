//
// Calculator.java          Author: Aidan Din
//
// Performs basic arithmetic operations
//
 
import java.util.Scanner; //imports the scanner utility in Java
 
public class Calculator //class declaration
{
  public static void main (String[] args)
 {
    System.out.println("1 = Addition\n2 = Subtraction\n3 = Multiplication\n4 = Division\n5 = Absolute Value"); //gives the user options for different mathematical operations
     
    System.out.println("Enter the number for the corresponding operation to select which operation you'd like to do.");
 
    Scanner scan = new Scanner(System.in); //creates the scanner for user input
    int operation = scan.nextInt(); //creates an integer for the operation the user wants to do
    double a, b, c, d, e, f, g, h, i, j, ab, cd, ef, gh; //creates all the doubles used in the actual mathematical operations
     
    if (operation == 1) { //calculates addition
      System.out.println("Enter the first number you'd like to add"); //the numbers the user will add
    a = scan.nextDouble();
      System.out.println("Enter the second number you'd like to add");
    b = scan.nextDouble();
    ab = a + b; // adds the integers for System.out.println to print
      System.out.println(a + " + " + b + " = " + ab); //the final result
    scan.close();
 
 
  } else if (operation == 2) { //calculates subtraction
      System.out.println("Enter the number you'd like to subtract from");
    c = scan.nextDouble();
      System.out.println("Enter the amount you're subtracting from the original number");
    d = scan.nextDouble();
    cd = c - d;
      System.out.println(c + " - " + d + " = " + cd);
    scan.close();
 
 
  } if (operation == 3) {
      System.out.println("Enter the first number you'd like to multiply"); //calculates multiplication
    e = scan.nextDouble();
      System.out.println("Enter the second number you'd like to multiply");
    f = scan.nextDouble();
    ef = e * f;
      System.out.println(e + " * " + f + " = " + ef);
    scan.close();
 
 
  } if (operation == 4) { //calculates division
      System.out.println("Enter the dividend");
    g = scan.nextDouble();
      System.out.println("Enter the divisor");
    h = scan.nextDouble();
    gh = g / h;
      System.out.println(g + "/" + h + " = " + gh);
    scan.close();
 
 
  } if (operation == 5) { //calculates absolute value
      System.out.println("Enter the number you'd like to get the absolute value of");
    i = scan.nextDouble();
    j = (Math.abs(i)); //Math.abs function to calculate absolute value
      System.out.println("The absolute value of " + i + " is " + j);
    scan.close();
    }
  }
}
