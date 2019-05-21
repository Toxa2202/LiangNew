import javax.swing.*;
import java.awt.*;

public class Lab_1211_GameDisplayFourCards extends JFrame {
        final int NUMBER_OF_CARDS = 4;

    public Lab_1211_GameDisplayFourCards() {
        int[] cards = new int[54];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i + 1;
        }

        setLayout(new GridLayout(1, NUMBER_OF_CARDS, 0, 0));

        JButton[] jbtArray = new JButton[NUMBER_OF_CARDS];
        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            jbtArray[i] = new JButton(new ImageIcon("resources/image/cards/back.png"));
            jbtArray[i].setPressedIcon(new ImageIcon("resources/image/cards/" +
                    cards[(int) (Math.random() * cards.length)] + ".png"));
            add(jbtArray[i]);
        }
    }

    public static void main(String[] args) {
        Lab_1211_GameDisplayFourCards frame = new Lab_1211_GameDisplayFourCards();
        frame.setTitle("Excercise12_11");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
