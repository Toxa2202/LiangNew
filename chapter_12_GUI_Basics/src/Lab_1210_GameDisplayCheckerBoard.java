import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;

public class Lab_1210_GameDisplayCheckerBoard extends JFrame {
    private static final int ELEMENTS = 8 * 8;

    public Lab_1210_GameDisplayCheckerBoard() {

        setLayout(new GridLayout(8, 8, 0, 0));

        Color nextColor = Color.WHITE;
        for (int i = 1; i <= 64; i++) {
            JButton jbTmp = new JButton();
            jbTmp.setBackground(nextColor);
            if (i % 8 != 0) {
                if (nextColor == Color.BLACK) {
                    nextColor = Color.WHITE;
                } else {
                    nextColor = Color.BLACK;
                }
            }
            add(jbTmp);
        }
    }

    public static void main(String[] args) {
        Lab_1210_GameDisplayCheckerBoard frame = new Lab_1210_GameDisplayCheckerBoard();
        frame.setTitle("Excercise12_10");
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
