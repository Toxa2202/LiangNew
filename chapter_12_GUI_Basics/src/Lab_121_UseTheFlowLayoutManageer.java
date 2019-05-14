import javax.swing.*;
import java.awt.*;

public class Lab_121_UseTheFlowLayoutManageer extends JFrame {
    // Contructor
    public Lab_121_UseTheFlowLayoutManageer() {
        // Set Main LayOut Parameters
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // First panel
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());

        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));

        // Second panel
        JPanel p2 = new JPanel();
        p1.setLayout(new FlowLayout());

        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));

        // Add panels to the frame
        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        // Create Main Frame
        Lab_121_UseTheFlowLayoutManageer frame = new Lab_121_UseTheFlowLayoutManageer();
        frame.setTitle("Excercise 12_1");
        frame.setSize(560, 85);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}