/*********************************************************
  * 
  * UserInfo.java           Author: Aidan Din
  * 
  * Gets a user's information and encrypted password.
  * 
  **********************************************************/

public class UserInfo {
    private String name, address, username, password;

    public User() {
        name = "";
        address = "";
        username = "";
        password = "";
    }
  
    public String encrypt(String s) {
        //runs all encrypt methods
        s = removeWhitespaceAndConvertToUpper(s);
        s = substitute(s);
        s = swapHalfsForEncrypt(s);
        s = swapFirst2WithLast2(s);
        s = swapMiddleChars(s);
        
        return s;
    }
    public String removeWhitespaceAndConvertToUpper(String s) {
        //removes trailing and leading whitespace
        s = s.trim();
        s = s.toUpperCase();
        
        return s;
    }
    public String substitute(String s) {
        //replaces all necessary characters in the passcode
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
        //splits a string into 2 pieces and returns the halves swapped
        String firstHalf, secondHalf;
        
        firstHalf = s.substring(0, s.length() + 1 / 2);
        secondHalf = s.substring(s.length() + 1 / 2, s.length());
        
        return secondHalf + firstHalf;
    }
    public String swapFirst2WithLast2(String s) {
        //splits s string into 3 pieces and swaps the first and third pieces
        String body = s.substring(2,  s.length() - 2);
        String first2 = s.substring(0, 2);
        String last2 = s.substring(s.length() - 2, s.length());
        
        return last2 + body + first2;
    }
    public String swapMiddleChars(String s) {
        //splits a string into 4 pieces and swaps the second and third pieces
        String body1, body2, middle1, middle2;
        
            //checks for odd/even string lengths
            body1 = s.substring(0, (s.length() + 1 / 2) - 2);
            middle1 = s.substring((s.length() + 1 / 2) - 2, s.length() / 2);
            middle2 = s.substring(s.length() + 1 / 2, (s.length() / 2) + 2);
            body2 = s.substring((s.length() + 1 / 2) + 2, s.length());
        
        return body1 + middle2 + middle1 + body2;
    }
}
