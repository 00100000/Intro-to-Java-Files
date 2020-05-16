//
// AboutMePanel.java           Author: Aidan Din
//
// User interactions with the AboutMe UI.
//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class AboutMePanel extends JPanel {
    // class variables
    private JButton name;
    private JButton language;
    private JButton food;
    private JButton activity;
    private JButton textEditor;
    private JLabel label;
    private ImageIcon icon;
    private boolean ifIcon;
    private HashMap<String, String> responseMap = new HashMap<String, String>();

    public AboutMePanel() {
        // all button names and listeners
        name = new JButton("My name is...");
        name.setName("name");
        name.addActionListener(new ButtonListener());

        language = new JButton("My favorite programming language is...");
        language.setName("language");
        language.addActionListener(new ButtonListener());

        food = new JButton("My favorite food is...");
        food.setName("food");
        food.addActionListener(new ButtonListener());

        activity = new JButton("My favorite activity is...");
        activity.setName("activity");
        activity.addActionListener(new ButtonListener());

        textEditor = new JButton("My favorite text editor is...");
        textEditor.setName("textEditor");
        textEditor.addActionListener(new ButtonListener());
        // hashmap for responses
        responseMap.put("name", "Aidan Din");
        responseMap.put("language", "JavaScript");
        responseMap.put("food", "Rice");
        responseMap.put("activity", "Playing video games");
        responseMap.put("textEditor", "VScode");
        // default label
        label = new JLabel("Answers over here...");
        // image
        icon = new ImageIcon("VScode.png");
        // align all items top to bottom
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        // add buttons and label
        add(name);
        add(language);
        add(food);
        add(activity);
        add(textEditor);
        add(label);
        setPreferredSize(new Dimension(300, 300));
    }
    // seperate listeners for seperate buttons
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // get response from HashMap
            String buttonName = ((JComponent) event.getSource()).getName();
            if (buttonName == "VScode") label.setIcon(icon);

            String hashResponse = responseMap.get(buttonName);
            label.setText(hashResponse);
        }
    }
}