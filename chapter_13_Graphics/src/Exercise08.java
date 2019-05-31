import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 28.05.2019.
 */
public class Exercise08 extends JFrame {
    public Exercise08() {
        add(new OctagonalPanel());
    }

    public static void main(String[] args) {
        Exercise08 frame = new Exercise08();
        frame.setTitle("Exercise13_8");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class OctagonalPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

        Polygon polygon = new Polygon();
        polygon.addPoint(xCenter + radius, yCenter);
        polygon.addPoint((int)(xCenter + radius * Math.cos(2 * Math.PI / 8)),
                (int)(yCenter - radius * Math.sin(2 * Math.PI / 8)));
        polygon.addPoint((int)(xCenter + radius * Math.cos(2 * 2 * Math.PI / 8)),
                (int)(yCenter - radius * Math.sin(2 * 2 * Math.PI / 8)));
        polygon.addPoint((int)(xCenter + radius * Math.cos(3 * 2 * Math.PI / 8)),
                (int)(yCenter - radius * Math.sin(3 * 2 * Math.PI / 8)));
        polygon.addPoint((int)(xCenter + radius * Math.cos(4 * 2 * Math.PI / 8)),
                (int)(yCenter - radius * Math.sin(4 * 2 * Math.PI / 8)));
        polygon.addPoint((int)(xCenter + radius * Math.cos(5 * 2 * Math.PI / 8)),
                (int)(yCenter - radius * Math.sin(5 * 2 * Math.PI / 8)));
        polygon.addPoint((int)(xCenter + radius * Math.cos(6 * 2 * Math.PI / 8)),
                (int)(yCenter - radius * Math.sin(6 * 2 * Math.PI / 8)));
        polygon.addPoint((int)(xCenter + radius * Math.cos(7 * 2 * Math.PI / 8)),
                (int)(yCenter - radius * Math.sin(7 * 2 * Math.PI / 8)));
        g.drawPolygon(polygon);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }
}
