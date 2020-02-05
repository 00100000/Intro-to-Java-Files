/*********************************************************
  * 
  * UserInfo.java           Author: Aidan Din
  * 
  * Gets a user's information and encrypted password.
  * 
  **********************************************************/

//@TODO:
// - CHANGE THE METHODS TO NON-STATIC METHODS AFTER TESTING
// - DELETE ALL COMMENTS

import javax.swing.JOptionPane;

public class UserInfo {
    //private String name, address, username, password;

    public static void main (String[]args) {
        String x = "HAMANDCHEESER";
      /*
        name = JOptionPane.showInputDialog("Please Enter Your Name");
        address = JOptionPane.showInputDialog("Please Enter Your Address");
        username = JOptionPane.showInputDialog("Please Enter Your Username");
        password = encrypt(JOptionPane.showInputDialog("Please Enter Your Password"));
      */
        //System.out.println(encrypt(x));
        System.out.println(removeWhitespaceAndConvertToUpper(x));
        System.out.println(substitute(x));
        System.out.println(swapHalfsForEncrypt(x));
        //System.out.println(swapFirst2WithLast2(x));
        //System.out.println(swapMiddleChars(x));
    }
    /* public String encrypt(String s) {
        s = removeWhitespaceAndConvertToUpper(s);
        s = substitute(s);
        s = swapHalfsForEncrypt(s);
        s = swapFirst2WithLast2(s);
        s = swapMiddleChars(s);
        
        return s;
    } */
    public static String removeWhitespaceAndConvertToUpper(String s) {
        s = s.trim();
        s = s.toUpperCase();
        
        return s;
    }
    public static String substitute(String s) {
        s = s.replace("A", "@");
        s = s.replace("E", "=");
        s = s.replace("I", "!");
        s = s.replace("J", "?");
        s = s.replace("O", "*");
        s = s.replace("P", "#");
        s = s.replace("R", "&");
        s = s.replace("S", "$");
        s = s.replace("T", "+");
        s = s.replace("V", "^");
        s = s.replace("X", "%");
        s = s.replace(" ", "_");
        
        return s;
    }
    public static String swapHalfsForEncrypt(String s) {
        String firstHalf, secondHalf;
        
        firstHalf = s.substring(0, s.length() / 2);
        secondHalf = s.substring(s.length() / 2, s.length());
        
        return secondHalf + firstHalf;
    } /*
    public String swapFirst2WithLast2(String s) {
        String body = s.subString(2,  s.length() - 3);
        String first2 = s.subString(0, 1);
        String last2 = s.subString(s.length() - 2, s.length() - 1);
        
        return last2 + body + first2;
    }
    public String swapMiddleChars(String s) {
        String body1, body2, middle1, middle2;
        
        if (s.length() % 2 == 0) {
            body1 = s.subString(0, (s.length() / 2) - 2);
            middle1 = s.subString((s.length() / 2) - 2, s.length() / 2);
            middle2 = s.subString(s.length() / 2, (s.length() / 2) + 2);
            body2 = s.subString((s.length() / 2) + 2, s.length() - 1);
        } else {
            body1 = s.subString(0, s.length() / 2 - 1);
            middle1 = s.subString(s.length() / 2 - 1, s.length() / 2 + 1);
            middle2 = s.subString(s.length() / 2 + 1, (s.length() / 2) + 3);
            body2 = s.subString((s.length() / 2) + 3, s.length() - 1);
        }
        
        return body1 + middle2 + middle1 + body2;
    } */
}
