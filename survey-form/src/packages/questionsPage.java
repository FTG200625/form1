package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS)); // Use BoxLayout with PAGE_AXIS
        panel.setBackground(new Color(0xCF9518)); // Set background color

        // Question 1
        JLabel question1 = new JLabel("How attractive do you find the software's user interface?");
        question1.setAlignmentX(Component.LEFT_ALIGNMENT); // Align label to the left

        JRadioButton radio1_1 = new JRadioButton("1");
        JRadioButton radio1_2 = new JRadioButton("2");
        JRadioButton radio1_3 = new JRadioButton("3");
        JRadioButton radio1_4 = new JRadioButton("4");
        JRadioButton radio1_5 = new JRadioButton("5");

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);

        // Create a horizontal box for radio buttons
        Box radioBox1 = Box.createHorizontalBox();
        radioBox1.add(radio1_1);
        radioBox1.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox1.add(radio1_2);
        radioBox1.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox1.add(radio1_3);
        radioBox1.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox1.add(radio1_4);
        radioBox1.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox1.add(radio1_5);

        // Question 2

        JLabel question2 = new JLabel("Is it easy for you to access the various features of the software?");
        question2.setAlignmentX(Component.LEFT_ALIGNMENT); // Align label to the left


        JRadioButton radio2_1 = new JRadioButton("1");
        JRadioButton radio2_2 = new JRadioButton("2");
        JRadioButton radio2_3 = new JRadioButton("3");
        JRadioButton radio2_4 = new JRadioButton("4");
        JRadioButton radio2_5 = new JRadioButton("5");

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);
        group2.add(radio2_4);
        group2.add(radio2_5);

        // Create a horizontal box for radio buttons
        Box radioBox2 = Box.createHorizontalBox();
        radioBox2.add(radio2_1);
        radioBox2.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox2.add(radio2_2);
        radioBox2.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox2.add(radio2_3);
        radioBox2.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox2.add(radio2_4);
        radioBox2.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox2.add(radio2_5);

        // Question 3
        JLabel question3 = new JLabel("How simple and user-friendly do you find the design of the software's pages?");
        question3.setAlignmentX(Component.LEFT_ALIGNMENT); // Align label to the left

        JRadioButton radio3_1 = new JRadioButton("1");
        JRadioButton radio3_2 = new JRadioButton("2");
        JRadioButton radio3_3 = new JRadioButton("3");
        JRadioButton radio3_4 = new JRadioButton("4");
        JRadioButton radio3_5 = new JRadioButton("5");


        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        // Create a horizontal box for radio buttons
        Box radioBox3 = Box.createHorizontalBox();
        radioBox3.add(radio3_1);
        radioBox3.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox3.add(radio3_2);
        radioBox3.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox3.add(radio3_3);
        radioBox3.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox3.add(radio3_4);
        radioBox3.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox3.add(radio3_5);

        // Question 4
        JLabel question4 = new JLabel("Are the colors and fonts used in the software appropriate?");
        question4.setAlignmentX(Component.LEFT_ALIGNMENT); // Align label to the left

        JRadioButton radio4_1 = new JRadioButton("1");
        JRadioButton radio4_2 = new JRadioButton("2");
        JRadioButton radio4_3 = new JRadioButton("3");
        JRadioButton radio4_4 = new JRadioButton("4");
        JRadioButton radio4_5 = new JRadioButton("5");

        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);
        group4.add(radio4_4);
        group4.add(radio4_5);

        // Create a horizontal box for radio buttons
        Box radioBox4 = Box.createHorizontalBox();
        radioBox4.add(radio4_1);
        radioBox4.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox4.add(radio4_2);
        radioBox4.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox4.add(radio4_3);
        radioBox4.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox4.add(radio4_4);
        radioBox4.add(Box.createRigidArea(new Dimension(10, 0))); // Spacing between buttons
        radioBox4.add(radio4_5);

        // Next button to go to Page3

        JButton nextButton = new JButton("next page");
        nextButton.setAlignmentX(Component.LEFT_ALIGNMENT); // Align button to the left
      
        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            thankYouPage thankYouPage = new thankYouPage();
            thankYouPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel with spacing
        panel.add(question1);
        panel.add(radioBox1);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing

        panel.add(question2);
        panel.add(radioBox2);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing

        panel.add(question3);
        panel.add(radioBox3);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing

        panel.add(question4);
        panel.add(radioBox4);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing

        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}