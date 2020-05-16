//
// AboutMe.java           Author: Aidan Din
//
// Driver file with the Jframe UI.
//

import javax.swing.*;
import java.util.*;

public class AboutMe {
    public static void main(String[] args) {
        // Cross-platform compatability
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // JFrame setup
        JFrame frame = new JFrame("AboutMe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new AboutMePanel());
        frame.pack();
        frame.setVisible(true);
    }
}