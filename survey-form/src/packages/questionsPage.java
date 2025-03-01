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
        JLabel question1 = new JLabel("چقدر رابط کاربری نرم افزار از نظر شما جذاب است؟");
        question1.setAlignmentX(Component.LEFT_ALIGNMENT); // Align label to the left

        JRadioButton radio1_1 = new JRadioButton("۱");
        JRadioButton radio1_2 = new JRadioButton("۲");
        JRadioButton radio1_3 = new JRadioButton("۳");
        JRadioButton radio1_4 = new JRadioButton("۴");
        JRadioButton radio1_5 = new JRadioButton("۵");

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
        JLabel question2 = new JLabel("آیا دسترسی به امکانات مختلف نرم افزار برای شما آسان است؟");
        question2.setAlignmentX(Component.LEFT_ALIGNMENT); // Align label to the left

        JRadioButton radio2_1 = new JRadioButton("۱");
        JRadioButton radio2_2 = new JRadioButton("۲");
        JRadioButton radio2_3 = new JRadioButton("۳");
        JRadioButton radio2_4 = new JRadioButton("۴");
        JRadioButton radio2_5 = new JRadioButton("۵");

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
        JLabel question3 = new JLabel("چقدر طراحی صفحات نرم افزار ساده و کاربرپسند است؟");
        question3.setAlignmentX(Component.LEFT_ALIGNMENT); // Align label to the left

        JRadioButton radio3_1 = new JRadioButton("۱");
        JRadioButton radio3_2 = new JRadioButton("۲");
        JRadioButton radio3_3 = new JRadioButton("۳");
        JRadioButton radio3_4 = new JRadioButton("۴");
        JRadioButton radio3_5 = new JRadioButton("۵");

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
        JLabel question4 = new JLabel("آیا رنگ ها و فونت های استفاده شده در نرم افزار مناسب هستند؟");
        question4.setAlignmentX(Component.LEFT_ALIGNMENT); // Align label to the left

        JRadioButton radio4_1 = new JRadioButton("۱");
        JRadioButton radio4_2 = new JRadioButton("۲");
        JRadioButton radio4_3 = new JRadioButton("۳");
        JRadioButton radio4_4 = new JRadioButton("۴");
        JRadioButton radio4_5 = new JRadioButton("۵");

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
        JButton nextButton = new JButton("صفحه بعد");
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