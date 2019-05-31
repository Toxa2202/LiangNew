import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 31.05.2019.
 */
public class Exercise26 extends JFrame {
    public Exercise26() {
        setLayout(new GridLayout(1, 2));

        MessagePanel messagePanel1 = new MessagePanel("Java");
        messagePanel1.setCentered(true);

        MessagePanel messagePanel2 = new MessagePanel("HTML");
        messagePanel2.setBackground(Color.YELLOW);
        messagePanel2.setCentered(true);

        MessagePanel messagePanel3 = new MessagePanel("Tomcat");
        messagePanel3.setCentered(true);

        MessagePanel messagePanel4 = new MessagePanel("PHP");
        messagePanel4.setBackground(Color.GREEN);
        messagePanel4.setCentered(true);

        add(messagePanel1, BorderLayout.EAST);
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(messagePanel2);
        panel.add(messagePanel3);
        panel.add(messagePanel4);
        add(messagePanel1);
        add(panel);
    }

    public static void main(String[] args) {
        Exercise26 frame = new Exercise26();
        frame.setTitle("Exercise26");
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class MessagePanel  extends JPanel {
    private String message;
    private int xCoordinate = 20;
    private int yCoordinate = 20;
    private boolean centered;
    private int interval = 10;

    public MessagePanel() {
    }

    public MessagePanel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        repaint();
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
        repaint();
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
        repaint();
    }

    public boolean isCentered() {
        return centered;
    }

    public void setCentered(boolean centered) {
        this.centered = centered;
        repaint();
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (centered) {
            FontMetrics fm = g.getFontMetrics();
            int stringWidth = fm.stringWidth(message);
            int stringAscent = fm.getAscent();
            xCoordinate = getWidth() / 2 - stringWidth / 2;
            yCoordinate = getHeight() / 2 + stringAscent / 2;
        }
        g.drawString(message, xCoordinate, yCoordinate);
    }

    public void moveRight() {
        xCoordinate += interval;
        repaint();
    }

    public void moveUp() {
        yCoordinate -= interval;
        repaint();
    }

    public void moveDown() {
        yCoordinate += interval;
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 30);
    }
}
