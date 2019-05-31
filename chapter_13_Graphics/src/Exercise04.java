import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 27.05.2019.
 */
public class Exercise04 extends JFrame {
    public Exercise04() {
        add(new MultiplPanel());
    }
    public static void main(String[] args) {
        Exercise04 frame = new Exercise04();
        frame.setTitle("Exercise13_4");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MultiplPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        g.drawString("Multiplication Table", 65, 20);
        g.setFont(new Font("SansSerif", Font.ITALIC, 14));

        for (int i = 0; i < 9; i++) {
            g.drawString((i + 1) + "", 70 + i * 30, 50);
            g.drawString((i + 1) + "", 30, 80 + i * 30);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                g.drawString(((i + 1) * (j + 1)) + "", 70 + i * 30, 80 + j * 30);
            }
        }
        g.drawRect(60, 60, 270, 270);
    }
}
