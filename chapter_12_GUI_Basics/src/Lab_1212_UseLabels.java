import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.*;


public class Lab_1212_UseLabels extends JFrame {
    public Lab_1212_UseLabels() {
        setLayout(new GridLayout(1, 4, 0, 0));
        ImageIcon usIcon1 = new ImageIcon("resources/image/flags/usIcon.gif");
        ImageIcon usIcon2 = new ImageIcon("resources/image/flags/usIcon.gif");
        ImageIcon usIcon3 = new ImageIcon("resources/image/flags/usIcon.gif");
        ImageIcon usIcon4 = new ImageIcon("resources/image/flags/usIcon.gif");

        JButton jbt1 = new JButton("US", usIcon1);
        jbt1.setHorizontalTextPosition(CENTER);
        jbt1.setVerticalTextPosition(BOTTOM);

        JButton jbt2 = new JButton("US", usIcon2);
        jbt2.setHorizontalTextPosition(RIGHT);
        jbt2.setVerticalTextPosition(CENTER);

        JButton jbt3 = new JButton("US", usIcon3);
        jbt3.setHorizontalTextPosition(LEFT);
        jbt3.setVerticalTextPosition(CENTER);

        JButton jbt4 = new JButton("US", usIcon4);
        jbt4.setHorizontalTextPosition(CENTER);
        jbt4.setVerticalTextPosition(TOP);

        add(jbt1);
        add(jbt2);
        add(jbt3);
        add(jbt4);


    }

    public static void main(String[] args) {
        Lab_1212_UseLabels frame = new Lab_1212_UseLabels();
        frame.setTitle("Excercise12_12");
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
