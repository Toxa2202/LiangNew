import javax.swing.*;
import java.awt.*;

public class Lab_123_GridLayout extends JFrame {
    // Same as previous Labs, but with the GridLayout
    public Lab_123_GridLayout() {
        setLayout(new GridLayout(2, 3));

        JPanel p1 = new JPanel();
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));

        JPanel p2 = new JPanel();
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));

        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        Lab_123_GridLayout frame = new Lab_123_GridLayout();
        frame.setTitle("Excercise 12_3");
        frame.setSize(300, 110);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
