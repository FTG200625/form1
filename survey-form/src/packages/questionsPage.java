package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(new Color(0xCF9518));

        // Question 1
        JLabel question1 = new JLabel("چقدر رابط کاربری نرم افزار از نظر شما جذاب است؟");
        question1.setAlignmentX(Component.LEFT_ALIGNMENT);

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

        JPanel radioPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel1.add(radio1_1);
        radioPanel1.add(radio1_2);
        radioPanel1.add(radio1_3);
        radioPanel1.add(radio1_4);
        radioPanel1.add(radio1_5);

        // Question 2
        JLabel question2 = new JLabel("آیا دسترسی به امکانات مختلف نرم افزار برای شما آسان است؟");
        question2.setAlignmentX(Component.LEFT_ALIGNMENT);

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

        JPanel radioPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel2.add(radio2_1);
        radioPanel2.add(radio2_2);
        radioPanel2.add(radio2_3);
        radioPanel2.add(radio2_4);
        radioPanel2.add(radio2_5);

        // Question 3
        JLabel question3 = new JLabel("چقدر طراحی صفحات نرم افزار ساده و کاربرپسند است؟");
        question3.setAlignmentX(Component.LEFT_ALIGNMENT);

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

        JPanel radioPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel3.add(radio3_1);
        radioPanel3.add(radio3_2);
        radioPanel3.add(radio3_3);
        radioPanel3.add(radio3_4);
        radioPanel3.add(radio3_5);

        // Question 4
        JLabel question4 = new JLabel("آیا رنگ ها و فونت های استفاده شده در نرم افزار مناسب هستند؟");
        question4.setAlignmentX(Component.LEFT_ALIGNMENT);

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

        JPanel radioPanel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel4.add(radio4_1);
        radioPanel4.add(radio4_2);
        radioPanel4.add(radio4_3);
        radioPanel4.add(radio4_4);
        radioPanel4.add(radio4_5);

        // Next button to go to Page3
        JButton nextButton = new JButton("صفحه بعد");
        nextButton.setAlignmentX(Component.LEFT_ALIGNMENT);
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
        panel.add(radioPanel1);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing

        panel.add(question2);
        panel.add(radioPanel2);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing

        panel.add(question3);
        panel.add(radioPanel3);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing

        panel.add(question4);
        panel.add(radioPanel4);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing

        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}