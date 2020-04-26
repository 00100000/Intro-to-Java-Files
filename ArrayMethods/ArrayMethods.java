//
// ArrayMethods.java           Author: Aidan Din
//
// Reverses an array and finds the smallest and largest
// elements in an array
//

import java.util.Scanner;

public class ArrayMethods {
  
  public static void main (String[]args) {
    /*int[] things = {3, 2, 1, 4, 5};
    System.out.println(toString(reverseArray(things)));
    System.out.println(smallestValue(things));
    System.out.println(largestValue(things));*/
    Scanner scan = new Scanner(System.in);
    char exit;
    
    do {
      // User interactions
      System.out.println("Which operation would you like to use?\n1. Reverse Array\n2. Smallest Value\n3. Largest Value");
      int opt = scan.nextInt();
      System.out.println("How many elements would you like in your array?");
      int elements = scan.nextInt();
      int[] elementArr = new int[elements];
        System.out.println("Please enter the elements of your array.");
      // Array element entering
      for (int i = 0; i < elements; i++) {
        System.out.println("Enter Element " + i + ":");
        elementArr[i] = scan.nextInt();
      }
      
      // Method switches + original array output
      System.out.println("You entered: " + toString(elementArr));
      if (opt == 1) {
        System.out.println("Array Reversed: " + toString(reverseArray(elementArr)));
      } else if (opt == 2) {
        System.out.println("Smallest Value: " + smallestValue(elementArr));
      } else if (opt == 3) {
        System.out.println("Largest Value: " + largestValue(elementArr));
      }
      
      // User exit loop
      System.out.println("Would you like to run this program against? (y/n)");
      exit = scan.next().charAt(0);
    } while (exit == 'y');
    scan.close();
  }
  public static int[] reverseArray(int[] arr) {
      // new array declarations
      int[] arr2 = new int[arr.length];
      int x = 0;
      
      arr2[0] = arr[arr.length - 1];
      
      // reverse index new array
      for (int i = arr.length - 1; i > 0; i--) {
        arr2[i] = arr[x];
        x++;
      }
      
      return arr2;
  }
  public static int smallestValue(int[] arr) {
    int min = arr[0];
    
    // check array for smallest value
    for (int i = 0; i < arr.length; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    
    return min;
  }
  public static int largestValue(int[] arr) {
    int max = arr[0];
    
    // check array for largest value
    for (int i = arr.length - 1; i > 0; i--) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    
    return max;
  }
  public static String toString(int[] arr) {
    String ret = "";
    
    // convert array into String
    for (int i = 0; arr.length > i; i++) {
      ret += arr[i] + " ";
    }
    
    return ret;
  }
}
