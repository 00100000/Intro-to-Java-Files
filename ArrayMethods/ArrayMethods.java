//
// ArrayMethods.java           Author: Aidan Din
//
// Encrypt methods and set and get methods.
//

import java.util.Scanner;

public class ArrayMethods {
  
  public static void main (String[]args) {
    int[] things = {3, 2, 1, 4, 5};
    System.out.println(toString(reverseArray(things)));
    System.out.println(smallestValue(things));
    System.out.println(largestValue(things));
    /*Scanner scan = new Scanner(System.in);
    
    do {
      // User interactions
      System.out.println("Which operation would you like to use?\n1. Reverse Array\n2.Smallest Value\n3. Largest Value");
      int opt = scan.nextInt();
      System.out.println("How many elements would you like in your array?");
      int elements = scan.nextInt();
      int[] elementArr = new int[elements];
        System.out.println("Please enter the elements of your array.");
      // Array element entering
      for (int i = 0; i < elements; i++) {
        System.out.println("Element " + i);
        elementArr[i] = scan.nextInt();
      }
      
      // Method switches
      if (opt == 1) {
        System.out.println("Array Reversed: " + reverseArray(elementArr));
      } else if (opt == 2) {
        System.out.println("Smallest Value: " + smallestValue(elementArr));
      } else if (opt == 3) {
        System.out.println("Largest Value: " + largestValue(elementArr));
      } else {
        System.out.println("Please enter a number between 1 to 3");
        opt = scan.nextInt();
      }
      
      //User exit loop
      char exit;
      System.out.println("Would you like to run this program against? (y/n)");
      //Exception Handling
      try {
        exit = scan.next().charAt(0);
      } catch (Exception e) {
        System.out.println("Please enter either y or n");
        exit = scan.next().charAt(0);
      }
      
    } //while (exit.equals("y")); */
  }
  public static int[] reverseArray(int[] arr) {
      int[] arr2 = new int[arr.length];
      int x = -2;
      
      for (int i = arr.length; i > 0; i--) {
        x++;
        arr2[x] = arr[i];
      }
      
      return arr2;
  }
  public static int smallestValue(int[] arr) {
    int min = arr[0];
    
    for (int i = 0; i < arr.length; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    
    return min;
  }
  public static int largestValue(int[] arr) {
    int max = arr[0];
    
    for (int i = arr.length; i > 0; i--) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    
    return max;
  }
  public static String toString(int[] arr) {
    String ret = "";
    
    for (int i = 0; arr.length > i; i++) {
      ret += " ," + arr[i];
    }
    
    return ret;
  }
}
