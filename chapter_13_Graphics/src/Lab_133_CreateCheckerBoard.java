import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 27.05.2019.
 */
public class Lab_133_CreateCheckerBoard extends JFrame {
    public  Lab_133_CreateCheckerBoard() {
        add(new MyPanel());
    }
    public static void main(String[] args) {
        Lab_133_CreateCheckerBoard frame = new Lab_133_CreateCheckerBoard();
        frame.setTitle("Exercise13_3");
        frame.setSize(340, 360);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyPanel extends JPanel {
    int size = 8 * 8;
    int coordinateX = 0;
    int coordinateY = 0;
    Color nextColor = Color.WHITE;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 1; i <= size; i++) {
            g.setColor(nextColor);
            g.fillRect(coordinateX, coordinateY, 40, 40);
            coordinateX += 40;

            if (i % 8 == 0) {
                coordinateX = 0;
                coordinateY += 40;
            }

            if (i % 8 != 0) {
                if (nextColor == Color.BLACK) {
                    nextColor = Color.WHITE;
                } else {
                    nextColor = Color.BLACK;
                }
            }
        }
    }
}
