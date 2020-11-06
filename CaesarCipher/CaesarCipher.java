//
// CaesarCipher.java     Author: Aidan Din
//
// Encodes and decodes messages via the CaesarCipher
//

import java.util.Scanner; //imports the scanner utility

public class CaesarCipher {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // User interactions
    System.out.println("Please enter the message (All lowercase characters will be converted to uppercase)");
    String msg = scan.nextLine();
    System.out.println(
        "Would you like to encode or decode the message? (Not case sensitive. Enter either encode or decode.)");
    String code = scan.nextLine();
    // error checking for encode/decode input
    if (!code.equalsIgnoreCase("encode") && !code.equalsIgnoreCase("decode")) {
      do {
        System.out.println("Please enter either encode or decode. This is not case sensitive");
        code = scan.nextLine();
      } while (!code.equalsIgnoreCase("encode") && !code.equalsIgnoreCase("decode"));
    }
    // asks the user for shift and calls the encode method
    if (code.equalsIgnoreCase("encode")) {
      System.out.println("Please enter how many characters you'd like your message to be shifted by.");
      int shiftAmount = scan.nextInt();
      // error handling for negative shifts
      while (shiftAmount < 0) {
        System.out.println("Sorry, you can't have a negative shift! Please re-enter a shift amount.");
        shiftAmount = scan.nextInt();
      }

      System.out.println(encode(msg, shiftAmount));
      // asks the user for shift and calls the decode method
    } else if (code.equalsIgnoreCase("decode")) {
      System.out.println("Please enter how many characters you'd like your message to be unshifted by.");
      int shiftAmount = scan.nextInt();

      while (shiftAmount < 0) { // error checking for negative shifts
        System.out.println("Sorry, you can't have a negative shift! Please re-enter a shift amount.");
        shiftAmount = scan.nextInt();
      }

      System.out.println(decode(msg, shiftAmount));
    }
  }

  public static String encode(String str, int Shift) {
      char[] arr = str.toCharArray();
      Shift %= 26;

      for (int i = 0; i < arr.length; i++) {
        if (Character.isLetter(arr[i])) {
          int trueShift = (int)arr[i] + Shift;

          if (trueShift > 90) {
            trueShift -= 26;
          } else if (trueShift < 65) {
            trueShift += 26;
          }

          arr[i] = (char)trueShift;
        }
      }
      return String.valueOf(arr);
    }
    public static String decode(String str, int Shift) {
      return encode(str, -Shift);
    }
}
