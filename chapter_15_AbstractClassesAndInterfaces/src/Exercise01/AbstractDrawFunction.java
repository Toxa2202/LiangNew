package Exercise01;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 19.07.2019.
 */
public abstract class AbstractDrawFunction extends JPanel {
    /** Polygon to hold the points */
    private Polygon p = new Polygon();

    protected  AbstractDrawFunction() {
        drawFunction();
    }

    /** Return the y-coordinate */
    abstract double f(double x);

    /** Obtain points for x-coordinates 100, 101, ..., 300 */
    public void drawFunction() {
        for (int x = -100; x <= 100; x++) {
            p.addPoint(x + 200, 200 - (int)f(x));
        }
    }

    @Override /** Draw axes, labels, and connect points */
    protected void paintComponent(Graphics g) {
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        g.drawLine(10, 200, 390, 200);
        g.drawLine(370, 210, 390, 200);
        g.drawLine(370, 190, 390, 200);
        g.drawString("X", 390, 190);
        g.drawLine(200, 10, 200, 390);
        g.drawString("Y", 210, 10);
        g.drawLine(190, 30, 200, 10);
        g.drawLine(210, 30, 200, 10);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(350, 350);
    }
}
