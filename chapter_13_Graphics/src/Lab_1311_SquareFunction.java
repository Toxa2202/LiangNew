import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 29.05.2019.
 */
public class Lab_1311_SquareFunction extends JFrame {
    public Lab_1311_SquareFunction() {
        add(new PoliDiagram());
    }

    public static void main(String[] args) {
        Lab_1311_SquareFunction frame = new Lab_1311_SquareFunction();
        frame.setTitle("Exercise13_11");
        frame.setSize(417, 260);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class PoliDiagram extends JLabel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        double scaleFactor = 0.1;
        Polygon p = new Polygon();
        for (int x = -100; x <= 100; x++) {
            p.addPoint(x + 200, 200 - (int) (scaleFactor * x * x));
        }
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        g.drawPolygon(p);
        // X line
        g.drawLine((int)(width * 0.05), (int)(height / 10 * 9.1),
                (int)(width * 0.95), (int)(height / 10 * 9.1));
        g.drawLine((int)(width * 0.95), (int)(height / 10 * 9.1),
                (int)(width * 0.95) - 15, (int)(height * 0.91) - 10);
        g.drawLine((int)(width * 0.95), (int)(height / 10 * 9.1),
                (int)(width * 0.95) - 15, (int)(height * 0.91) + 10);
        g.drawString("X", (int)(width * 0.9), (int)(height * 0.8));

        // Y line
        g.drawLine((width / 2), (height / 6), (width / 2), (height / 10 * 9));
        g.drawLine((width / 2), (height / 6),(width / 2) - 10, (height / 6) + 15);
        g.drawLine((width / 2), (height / 6),(width / 2) + 10, (height / 6) + 15);
        g.drawString("Y", (int)(width * 0.55), (int)(height * 0.1));
    }
}
