/*********************************************************
  * 
  * UserInfo.java           Author: Aidan Din
  * 
  * Gets a user's information and encrypted password.
  * 
  **********************************************************/

//@TODO:
// - User exit loop
// - JOptionPane (move to driver file)
// - Driver file

import javax.swing.JOptionPane;

public class UserInfo {
  private String name, address, username, password;
  
    public String encrypt(String s) {
        s = removeWhitespaceAndConvertToUpper(s);
        s = substitute(s);
        s = swapHalfsForEncrypt(s);
        s = swapFirst2WithLast2(s);
        s = swapMiddleChars(s);
        
        return s;
    }
    public String removeWhitespaceAndConvertToUpper(String s) {
        s = s.trim();
        s = s.toUpperCase();
        
        return s;
    }
    public String substitute(String s) {
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
    public String swapHalfsForEncrypt(String s) {
        String firstHalf, secondHalf;
        
        firstHalf = s.substring(0, s.length() / 2);
        secondHalf = s.substring(s.length() / 2, s.length());
        
        return secondHalf + firstHalf;
    }
    public String swapFirst2WithLast2(String s) {
        String body = s.substring(2,  s.length() - 2);
        String first2 = s.substring(0, 2);
        String last2 = s.substring(s.length() - 2, s.length());
        
        return last2 + body + first2;
    }
    public String swapMiddleChars(String s) {
        String body1, body2, middle1, middle2;
        
        if (s.length() % 2 == 0) {
            body1 = s.substring(0, (s.length() / 2) - 2);
            middle1 = s.substring((s.length() / 2) - 2, s.length() / 2);
            middle2 = s.substring(s.length() / 2, (s.length() / 2) + 2);
            body2 = s.substring((s.length() / 2) + 2, s.length());
        } else {
            body1 = s.substring(0, (s.length() / 2) - 1);
            middle1 = s.substring((s.length() / 2) - 1, s.length() / 2 + 1);
            middle2 = s.substring(s.length() / 2 + 1, (s.length() / 2) + 3);
            body2 = s.substring((s.length() / 2) + 3, s.length());
        }
        
        return body1 + middle2 + middle1 + body2;
    }
}
