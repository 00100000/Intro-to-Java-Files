import javax.swing.JOptionPane; //imports JOptionPane

public class MailingLabel
{
    public static void main (String[] args)
    {
        String delimeter = JOptionPane.showInputDialog("Please enter a delimeter for your mailing address.");
        while (delimeter.length() != 1) {
            delimeter = JOptionPane.showInputDialog("Sorry, your delimeter must be 1 character long. Please re-enter.");

        String finalMessage = JOptionPane.showInputDialog("Please enter your final message with delimeters to seperate different lines.");

        System.out.println("----------------------------");
        System.out.println(mailingLabel(finalMessage, delimeter));
        System.out.println("----------------------------");
        }
    }
    public static String mailingLabel(String str, String del) {
        return "WIP";
    }
}
