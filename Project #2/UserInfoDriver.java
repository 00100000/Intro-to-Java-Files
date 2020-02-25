//
// UserInfoDriver.java           Author: Aidan Din
//
// Driver file for UserInfo.java
//

import javax.swing.JOptionPane;

public class UserInfoDriver {

    public static void main (String[]args) {
        String n, a, u, p;
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //new user object
        UserInfo userinfo = new UserInfo();
        //user input
        n = JOptionPane.showInputDialog("Please enter your name.");
        a = JOptionPane.showInputDialog("Please enter your address.");
        u = JOptionPane.showInputDialog("Please enter your username.");
        p = JOptionPane.showInputDialog("Please enter your password.");
        
        //testing set methods
        userinfo.setName(n);
        userinfo.setAddress(a);
        userinfo.setUsername(u);
        userinfo.setPassword(p);
        
        //testing get methods
        System.out.println(userinfo.getName());
        System.out.println(userinfo.getAddress());
        System.out.println(userinfo.getUsername());
        System.out.println(userinfo.getPassword());
        
        //testing get methods
        System.out.println(userinfo.encrypt(s));
        System.out.println(userinfo.removeWhitespaceAndConvertToUpper(s));
        System.out.println(userinfo.substitute(s));
        System.out.println(userinfo.swapHalfsForEncrypt(s));
        System.out.println(userinfo.swapFirst2WithLast2(s));
        System.out.println(userinfo.swapMiddleChars(s));
    }
}
