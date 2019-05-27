import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 27.05.2019.
 */
public class Lab_135_TriangularPattern extends JFrame {
    public Lab_135_TriangularPattern() {
        add(new TriangularPanel());
    }


    public static void main(String[] args) {
        Lab_135_TriangularPattern frame = new Lab_135_TriangularPattern();
        frame.setTitle("Exercise13_5");
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class TriangularPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.setFont(new Font("SansSerif", Font.BOLD, 14));
        FontMetrics fm = g.getFontMetrics();
        int i = 1;
        String newLine = "";
        do {
            g.drawString(newLine, 0, i * fm.getHeight());
            newLine = "";
            for (int j = 1; j <= i; j++) {
                newLine += " " + j;
            }
            i++;
            // If String is longer & higher, than window, it is not shown.
            // That's why we have Resize effect.
        } while ((fm.stringWidth(newLine) <= width) && (fm.getHeight() * i <= height));
    }
}
