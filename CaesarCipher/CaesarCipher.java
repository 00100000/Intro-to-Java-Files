//
// CaesarCipher.java     Author: Aidan Din
//
// Encodes and decodes messages via the CaesarCipher
//

import java.util.Scanner; //imports the scanner utility

public class CaesarCipher
  {
    public static void main (String[] args)
     {
      Scanner scan = new Scanner(System.in);

      System.out.println("Please enter the message (All lowercase characters will be converted to uppercase)"); //scans for the user's message
      String msg = scan.nextLine();

      System.out.println("Would you like to encode or decode the message? (Not case sensitive. Enter either encode or decode.)");//scans for decoding or encoding the message
      String code = scan.nextLine();
      
      if (!code.equalsIgnoreCase("encode") && !code.equalsIgnoreCase("decode")) { //error checking for encode/decode input
        do {
          System.out.println("Please enter either encode or decode. This is not case sensitive");
          code = scan.nextLine();
        } while (!code.equalsIgnoreCase("encode") && !code.equalsIgnoreCase("decode"));
      }

      if (code.equalsIgnoreCase("encode")) { //asks the user for shift and calls the encode method
        System.out.println("Please enter how many characters you'd like your message to be shifted by.");
        int shiftAmount = scan.nextInt();
        
        while (shiftAmount < 0) { //error checking for negative shifts
            System.out.println("Sorry, you can't have a negative shift! Please re-enter a shift amount.");
            shiftAmount = scan.nextInt();
        }

        System.out.println(encode(msg, shiftAmount)); //calling encode method
        
      } else if (code.equalsIgnoreCase("decode")) { //asks the user for shift and calls the decode method
        System.out.println("Please enter how many characters you'd like your message to be unshifted by.");
        int shiftAmount = scan.nextInt();
        
        while (shiftAmount < 0) { //error checking for negative shifts
            System.out.println("Sorry, you can't have a negative shift! Please re-enter a shift amount.");
            shiftAmount = scan.nextInt();
        }
        
        System.out.println(decode(msg, shiftAmount)); //calling decode method
      }
    }
   public static String encode(String str, int Shift) { //encode method
      int ascii = 0;
      String finalMessage = ""; //declared earlier to be returned later
      
      String strUpper = str.toUpperCase();
      int messageLength = strUpper.length() - 1;
      
      for (int index = 0; index <= messageLength; index++) {
          char messageChar = strUpper.charAt(index); //gets the character from the string for conversion
          ascii = ((messageChar - 'A') + Shift) % 26 + 'A'; //subtracts a, adds shift, gets the remainder of messageChar plus Shift to make sure it's smaller than Z before re-adding A
          finalMessage += (char)(ascii); //converts back to characters
      }
      return finalMessage;
  }
   public static String decode(String str, int Shift) {
      int ascii = 0;
      String finalMessage = ""; //declared earlier to be returned later
      
      String strUpper = str.toUpperCase();
      int messageLength = strUpper.length() - 1;
      
      for (int index = 0; index <= messageLength; index++) {
          char messageChar = strUpper.charAt(index);  //gets the character from the string for conversion
          ascii = ((messageChar - 'Z') - Shift) % 26 + 'Z';
          finalMessage += (char)(ascii); //converts back to characters
      }
      return finalMessage;
  }
}
