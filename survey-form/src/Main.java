import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame

        JFrame frame = new JFrame("survey form");

        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(0xCF9518));


        Font customFont = new Font("Comic Sans MS", Font.BOLD, 24);
        
        // Create title label
        JLabel title = new JLabel("survey form");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.NORTH);
        title.setFont(customFont);

        // Create start button
        JButton startButton = new JButton("start!");
        startButton.setHorizontalAlignment(JLabel.CENTER);
        startButton.setVerticalAlignment(JLabel.CENTER);
        startButton.setFont(customFont);


        // Add components to the panel
        panel.add(title);
        panel.add(startButton);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
