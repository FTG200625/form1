package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(0xCF9518));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("اسم");
        JTextField nameField = new JTextField(15);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن");
        JTextField ageField = new JTextField(15);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل");
        JTextField emailField = new JTextField(15);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");

        JRadioButton level1 = new JRadioButton("مبتدی");
        JRadioButton level2 = new JRadioButton("متوسط");
        JRadioButton level3 = new JRadioButton("پیشرفته");
        JRadioButton level4 = new JRadioButton("بدون آشنایی");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("صفحه بعد");
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