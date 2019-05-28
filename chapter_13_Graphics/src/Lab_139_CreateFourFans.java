import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 28.05.2019.
 */
public class Lab_139_CreateFourFans extends JFrame {
    public Lab_139_CreateFourFans() {
        setLayout(new GridLayout(2, 2, 5, 5));
        int size = 4;
        for (int i = 0; i < size; i++) {
            add(new FanPanel());
        }
    }

    public static void main(String[] args) {
        Lab_139_CreateFourFans frame = new Lab_139_CreateFourFans();
        frame.setTitle("Exercise13_9");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class FanPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight() * 0.4));
        int xArc = xCenter - radius;
        int yArc = yCenter - radius;

        g.setColor(Color.GRAY);
        g.fillArc(xArc, yArc, 2 * radius, 2 * radius, 0, 30);
        g.fillArc(xArc, yArc, 2 * radius, 2 * radius, 90, 30);
        g.fillArc(xArc, yArc, 2 * radius, 2 * radius, 180, 30);
        g.fillArc(xArc, yArc, 2 * radius, 2 * radius, 270, 30);
        g.drawOval((int)(0.09 * width), (int)(0.08 * height),
                (int)(0.82 * width), (int)(0.85 * height));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }
}
