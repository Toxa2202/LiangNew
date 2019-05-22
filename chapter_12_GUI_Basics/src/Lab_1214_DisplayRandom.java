import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class Lab_1214_DisplayRandom extends JFrame {
    public Lab_1214_DisplayRandom() {
        String text;
        int matrixSize = 10 * 10;

        setLayout(new GridLayout(10, 10, 1, 1));
        for (int i = 0; i < matrixSize; i++) {
            int random = Math.random() > 0.5 ? 1 : 0;
            if (random == 0) {
                text = "0";
            } else {
                text = "1";
            }
            add(new JLabel(text, CENTER));
        }
    }

    public static void main(String[] args) {
        Lab_1214_DisplayRandom frame = new Lab_1214_DisplayRandom();
        frame.setTitle("Excercise12_14");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
