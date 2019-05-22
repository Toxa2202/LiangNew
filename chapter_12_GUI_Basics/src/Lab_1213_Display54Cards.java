import javax.swing.*;
import java.awt.*;

public class Lab_1213_Display54Cards extends JFrame {
    public Lab_1213_Display54Cards() {
        int[] cards = new int[54];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i + 1;
        }

        setLayout(new GridLayout(0, 8, 1, 1));
        for (int i = 0; i < cards.length; i++) {
            add(new JLabel(new ImageIcon("resources/image/cards/" + cards[i] + ".png")));
        }
    }

    public static void main(String[] args) {
        Lab_1213_Display54Cards frame = new Lab_1213_Display54Cards();
        frame.setTitle("Excercise12_13");
        frame.setSize(700, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
