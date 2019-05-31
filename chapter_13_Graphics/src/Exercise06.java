import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 28.05.2019.
 */
public class Exercise06 extends JFrame {
    public Exercise06() {
        setLayout(new GridLayout(2, 2, 5, 5));
        add(new FigurePanel(FigurePanel.ARC));
        add(new FigurePanel(FigurePanel.POLYGON));
        add(new FigurePanel(FigurePanel.ARC, true));
        add(new FigurePanel(FigurePanel.POLYGON, true));
    }

    public static void main(String[] args) {
        Exercise06 frame = new Exercise06();
        frame.setTitle("Exercise13_6");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class FigurePanel extends JPanel{

    public static final int ARC = 1;
    public static final int POLYGON = 2;
    private int type = 1;
    private boolean filled = false;

    public FigurePanel() {
    }

    public FigurePanel(int type) {
        this.type = type;
    }

    public FigurePanel(int type, boolean filled) {
        this.type = type;
        this.filled = filled;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight() * 0.4));
        int xArc = xCenter - radius;
        int yArc = yCenter - radius;

        Polygon polygon = new Polygon();

        switch (type) {
            case ARC:
                if (filled) {
                    g.fillArc(xArc, yArc, 2 * radius, 2 * radius, 0, 30);
                    g.fillArc(xArc, yArc, 2 * radius, 2 * radius, 90, 30);
                    g.fillArc(xArc, yArc, 2 * radius, 2 * radius, 180, 30);
                    g.fillArc(xArc, yArc, 2 * radius, 2 * radius, 270, 30);
                } else {
                    g.drawArc(xArc, yArc, 2 * radius, 2 * radius, 0, 30);
                    g.drawArc(xArc, yArc, 2 * radius, 2 * radius, 90, 30);
                    g.drawArc(xArc, yArc, 2 * radius, 2 * radius, 180, 30);
                    g.drawArc(xArc, yArc, 2 * radius, 2 * radius, 270, 30);
                }
                break;

            case POLYGON:
                if (filled) {
                    polygon.addPoint(xCenter + radius, yCenter);
                    polygon.addPoint((int)(xCenter + radius * Math.cos(2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(2 * Math.PI / 6)));
                    polygon.addPoint((int)(xCenter + radius * Math.cos(2 * 2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(2 * 2 * Math.PI / 6)));
                    polygon.addPoint((int)(xCenter + radius * Math.cos(3 * 2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(3 * 2 * Math.PI / 6)));
                    polygon.addPoint((int)(xCenter + radius * Math.cos(4 * 2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(4 * 2 * Math.PI / 6)));
                    polygon.addPoint((int)(xCenter + radius * Math.cos(5 * 2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(5 * 2 * Math.PI / 6)));
                    g.fillPolygon(polygon);
                } else {
                    polygon.addPoint(xCenter + radius, yCenter);
                    polygon.addPoint((int)(xCenter + radius * Math.cos(2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(2 * Math.PI / 6)));
                    polygon.addPoint((int)(xCenter + radius * Math.cos(2 * 2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(2 * 2 * Math.PI / 6)));
                    polygon.addPoint((int)(xCenter + radius * Math.cos(3 * 2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(3 * 2 * Math.PI / 6)));
                    polygon.addPoint((int)(xCenter + radius * Math.cos(4 * 2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(4 * 2 * Math.PI / 6)));
                    polygon.addPoint((int)(xCenter + radius * Math.cos(5 * 2 * Math.PI / 6)),
                            (int)(yCenter - radius * Math.sin(5 * 2 * Math.PI / 6)));
                    g.drawPolygon(polygon);
                }
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        repaint();
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 100);
    }
}
