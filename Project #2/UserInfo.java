import javax.swing.JOptionPane;

public class UserInfo {
    private String name, address, username, password;

    public static void main (String[]args) {
        name = JOptionPane.showInputDialog("Please Enter Your Name");
        address = JOptionPane.showInputDialog("Please Enter Your Address");
        username = JOptionPane.showInputDialog("Please Enter Your Username");
        password = encrypt(JOptionPane.showInputDialog("Please Enter Your Password"));
    }
    public String encrypt(String s) {
        removeWhitespaceAndCovertToUpper(s);
        substitute(s);
        swapHalfsForEncrypt(s);
        swapFirst2WithLast2(s);
        swapMiddleChars(s);
    }
    public String removeWhitespaceAndCovertToUpper(String s) {
        s.trim();
        s.toUpperCase();
    }
    public String substitute(String s) {
        s.replaceAll("A", "@");
        s.replaceAll("E", "=");
        s.replaceAll("I", "!");
        s.replaceAll("J", "?");
        s.replaceAll("O", "*");
        s.replaceAll("P", "#");
        s.replaceAll("R", "&");
        s.replaceAll("S", "$");
        s.replaceAll("T", "+");
        s.replaceAll("V", "^");
        s.replaceAll("X", "%");
        s.replaceAll(" ", "_");
    }
    public String swapHalfsForEncrypt(String s) {
    }
}
