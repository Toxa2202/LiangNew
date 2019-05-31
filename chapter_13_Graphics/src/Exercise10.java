import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 28.05.2019.
 */
public class Exercise10 extends JFrame {
    public Exercise10() {
        add(new CylinderLabel());
    }

    public static void main(String[] args) {
        Exercise10 frame = new Exercise10();
        frame.setTitle("Exercise13_10");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class CylinderLabel extends JLabel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawOval((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.25 * height));
        g.drawLine((int)(0.1 * width), (int)(0.22 * height), (int)(0.1 * width), (int)(0.78 * height));
        g.drawLine((int)(0.9 * width), (int)(0.22 * height), (int)(0.9 * width), (int)(0.78 * height));
        g.drawArc((int)(0.1 * width), (int)(0.65 * height), (int)(0.8 * width), (int)(0.25 * height), 180, 180);
        g.drawArc((int)(0.1 * width), (int)(0.65 * height), (int)(0.8 * width), (int)(0.25 * height), 0, 20);
        g.drawArc((int)(0.1 * width), (int)(0.65 * height), (int)(0.8 * width), (int)(0.25 * height), 40, 20);
        g.drawArc((int)(0.1 * width), (int)(0.65 * height), (int)(0.8 * width), (int)(0.25 * height), 80, 20);
        g.drawArc((int)(0.1 * width), (int)(0.65 * height), (int)(0.8 * width), (int)(0.25 * height), 120, 20);
        g.drawArc((int)(0.1 * width), (int)(0.65 * height), (int)(0.8 * width), (int)(0.25 * height), 160, 20);
    }
}
