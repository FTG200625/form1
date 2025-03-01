package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(0xCF9518));
      
        Font customFont = new Font("Comic Sans MS", Font.BOLD, 24);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("name");
        nameLabel.setFont(customFont);
        JTextField nameField = new JTextField(15);

        // Age Label and Text Field

        JLabel ageLabel = new JLabel("age");
        ageLabel.setFont(customFont);
        JTextField ageField = new JTextField(15);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("email");
        emailLabel.setFont(customFont);
        JTextField emailField = new JTextField(15);

        // Software Familiarity Level

        JLabel levelLabel = new JLabel("the level of familiarity to software:");
        levelLabel.setFont(customFont);

        JRadioButton level1 = new JRadioButton("begginer");
        level1.setFont(customFont);
        JRadioButton level2 = new JRadioButton("intermediate");
        level2.setFont(customFont);
        JRadioButton level3 = new JRadioButton("advanced");
        level3.setFont(customFont);
        JRadioButton level4 = new JRadioButton("not familiar");
        level4.setFont(customFont);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("next page");
        nextButton.setFont(customFont);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel with rigid areas for spacing
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Top spacing
        panel.add(nameLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));  // Spacing between label and field
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing between fields

        panel.add(ageLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));  // Spacing between label and field
        panel.add(ageField);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing between fields

        panel.add(emailLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));  // Spacing between label and field
        panel.add(emailField);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing between fields

        panel.add(levelLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));  // Spacing between label and radio buttons

        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);

        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing before the button

        panel.add(nextButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Bottom spacing

        // Add panel to the frame
        frame.add(panel);
    }
}

