package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(0xCF9518));


        // Create thank you label
        JLabel thankYouLabel = new JLabel("با تشکر از مشارکت شما!");

        // Add components to the panel
        panel.add(thankYouLabel,BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}
