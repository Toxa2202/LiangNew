import javax.swing.*;
import java.awt.*;

public class Lab_129_GameDisplayThreeCards extends JFrame {
    public Lab_129_GameDisplayThreeCards() {
        // Here we collect our cards
        int[] cards = new int[54];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i + 1;
        }

//        for (int i = 0; i < cards.length; i++) {
//            int index = (int) (Math.random() * cards.length);
//            int temp = cards[i];
//            cards[i] = cards[index];
//            cards[index] = temp;
//        }
        // Create Labels and add Random card to every label
        setLayout(new GridLayout(1, 3, 5, 5));
        add(new JLabel(new ImageIcon("resources/image/cards/" + cards[(int) (Math.random() * cards.length)] + ".png")));
        add(new JLabel(new ImageIcon("resources/image/cards/" + cards[(int) (Math.random() * cards.length)] + ".png")));
        add(new JLabel(new ImageIcon("resources/image/cards/" + cards[(int) (Math.random() * cards.length)] + ".png")));
    }

    public static void main(String[] args) {
        // Create typical frame
        Lab_129_GameDisplayThreeCards frame = new Lab_129_GameDisplayThreeCards();
        frame.setTitle("Excercise12_9");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
