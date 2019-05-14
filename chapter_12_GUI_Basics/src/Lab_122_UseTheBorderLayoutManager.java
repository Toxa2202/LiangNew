import javax.swing.*;
import java.awt.*;

public class Lab_122_UseTheBorderLayoutManager extends JFrame {
    // Same as in the Previous Lab, but with BorderLayout
    public Lab_122_UseTheBorderLayoutManager() {
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));

        JPanel p2 = new JPanel();
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Lab_122_UseTheBorderLayoutManager frame = new Lab_122_UseTheBorderLayoutManager();
        frame.setTitle("Excercise 12_2");
        frame.setSize(300, 110);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
