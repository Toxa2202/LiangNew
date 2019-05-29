import javafx.scene.shape.Polyline;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 29.05.2019.
 */
public class Lab_1312_SineCosineFunctions extends JFrame {
    public Lab_1312_SineCosineFunctions() {
        add(new SinCosFunc());
    }
    public static void main(String[] args) {
        Lab_1312_SineCosineFunctions frame = new Lab_1312_SineCosineFunctions();
        frame.setTitle("Exercise13_12");
        frame.setSize(470, 210);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class SinCosFunc extends JLabel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // X line
        g.drawLine((int)(width * 0.05), (int)(height * 0.6), (int)(width * 0.95), (int)(height * 0.6));
        g.drawLine((int)(width * 0.95), (int)(height * 0.6),(int)(width * 0.95) - 15, (int)(height * 0.7) - 10);
        g.drawLine((int)(width * 0.95), (int)(height * 0.6),(int)(width * 0.95) - 15, (int)(height * 0.6) - 10);
        g.drawString("X", (int)(width * 0.9), (height / 2));

        // Y line
        g.drawLine((width / 2), (height / 9), (width / 2), (height));
        g.drawLine((width / 2), (height / 9),(width / 2) - 10, (height / 6) + 15);
        g.drawLine((width / 2), (height / 9),(width / 2) + 10, (height / 6) + 15);
        g.drawString("Y", (int)(width * 0.55), (int)(height * 0.1));

        // Signature
        g.drawString("-2\u03c0", (int)(width * 0.25), (int)(height * 0.7));
        g.drawString("-\u03c0", (int)(width * 0.4), (int)(height * 0.7));
        g.drawString("2\u03c0", (int)(width * 0.75), (int)(height * 0.7));
        g.drawString("\u03c0", (int)(width * 0.6), (int)(height * 0.7));
        g.drawString("0", (int)(width * 0.48), (int)(height * 0.7));

        // Polygon Sin
        Polygon p = new Polygon();
        g.setColor(Color.RED);
        for (int x = -(int)(width * 0.39); x <= (int)(width * 0.39); x++) {
            p.addPoint(x + (int)(width * 0.5), (int)(height * 0.5) - (int)(50 * Math.sin((x / 100.0) * 2 * Math.PI)));
        }
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);

        // Polygon Cos
        p = new Polygon();
        g.setColor(Color.BLUE);
        for (int x = -(int)(width * 0.374); x <= (int)(width * 0.374); x++) {
            p.addPoint(x + (int)(width * 0.5), (int)(height * 0.5) - (int)(50 * Math.cos((x / 100.0) * 2 * Math.PI)));
        }
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    }
}
