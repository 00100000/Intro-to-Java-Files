//
// UserInfoDriver.java           Author: Aidan Din
//
// Driver file for UserInfo.java
//

import javax.swing.JOptionPane;

public class UserInfoDriver {

    public static void main (String[]args) {
        //declare new strings and user object
        String n, a, u, p;
        UserInfo user = new UserInfo();

        //user input
        n = JOptionPane.showInputDialog("Please enter your name.");
        a = JOptionPane.showInputDialog("Please enter your address.");
        u = JOptionPane.showInputDialog("Please enter your username.");
        p = JOptionPane.showInputDialog("Please enter your password.");

        //sets user information
        user.setName(n);
        user.setAddress(a);
        user.setUsername(u);
        user.setPassword(p);

        //outputs information
        JOptionPane.showMessageDialog(
            null,
            "Name: " + user.getName() + "\n" +
            "Address: " + user.getAddress() + "\n" +
            "Username: " + user.getUsername() +"\n" +
            "Password: " + user.getPassword()
        );
    }
}
