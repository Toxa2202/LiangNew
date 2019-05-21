import javax.swing.*;
import java.awt.*;

public class Lab_127_Game extends JFrame {
    // Constant
    private static final int GAME_SIZE = 3;

    public Lab_127_Game(){
        // Create gridLayout 3 x 3 with zero gaps
        setLayout(new GridLayout(3, 3, 0, 0));
        // write elements inside a layout with for loop
        for (int i = 0; i < GAME_SIZE * GAME_SIZE; i++) {
            // Random digit for choose 'X' or 'O'
            int rand = (int) (Math.random() * 3);
            // Action if Random == zero
            if (rand == 0) {
                // add empty label
                add(new JLabel());
            // OR
            } else {
                // Add randomly choosen gif image from TicTacToe folder
                add(new JLabel(new ImageIcon("resources/image/TicTacToe/" +
                        (rand == 1 ? "o" : "x") + ".gif")));
            }
        }
    }

    public static void main(String[] args) {
        // In main method we create main frame for all our elements
        Lab_127_Game frame = new Lab_127_Game(); // Create object Frame
        frame.setTitle("Excercise12_7"); // Set name
        frame.setSize(200, 200); // Set size
        frame.setLocationRelativeTo(null); // Set location to center
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set action on close
        frame.setVisible(true); // Set visibility
    }
}
