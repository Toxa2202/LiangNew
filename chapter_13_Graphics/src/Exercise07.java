import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 28.05.2019.
 */
public class Exercise07 extends JFrame {
    public Exercise07() {
        setLayout(new GridLayout(3, 3, 5, 5));

        int size = 9;
        for (int i = 0; i < size; i++) {
            add(new CustomPanel());
        }
    }

    public static void main(String[] args) {
        Exercise07 frame = new Exercise07();
        frame.setTitle("Exercise13_7");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CustomPanel extends JPanel{
    public static final int LINES = 1;
    public static final int OVAL = 2;
    public static final int EMPTY = 3;
    private int type = (int) (Math.floor(Math.random() * 3) + 1);

    public CustomPanel() {

    }

    public CustomPanel(int type) {
        this.type = type;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        switch (type) {
            case LINES:
                g.drawLine(10, 10, width - 10, height - 10);
                g.drawLine(width - 10, 10, 10, height - 10);
                break;
            case OVAL:
                g.drawOval((int)(0.1 * width), (int)(0.1 * height),
                        (int)(0.8 * width), (int)(0.8 * height));
            case EMPTY:
                // do nothing
        }
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(80, 80);
    }
}
