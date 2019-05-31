import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 27.05.2019.
 */
public class Exercise02 extends JFrame {

    public Exercise02() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        add(new OvalButton("OK"));
        add(new OvalButton("Cancel"));
    }

    public static void main(String[] args) {
        Exercise02 frame = new Exercise02();
        frame.setTitle("Excercise13_2");
        frame.setSize(500, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class OvalButton extends JButton {
    public OvalButton() {
        super();
    }

    public OvalButton(String title) {
        super(title);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawOval(width / 10, height / 10,
                width - width / 5, height - height / 5);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(230, 100);
    }
}
