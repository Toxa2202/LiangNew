import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Lab_128_SwingCommonFeatures extends JFrame {

    private static final int GRID_SIZE = 2 * 3;

    public Lab_128_SwingCommonFeatures() {
        setLayout(new GridLayout(2, 3, 0, 0));
        // Create an array for collect all labels
        JLabel jLabelArray[] = new JLabel[GRID_SIZE];
        // Create an array for names of labels in needed order
        String[] colorsInString = {"black", "blue", "cyan", "green", "magenta", "orange"};
        // Create an array for storing colors in needed order
        Color[] colorsInColor = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.ORANGE};

        // In loop add parameters from arrays to labels in needed order
        for (int i = 0; i < jLabelArray.length; i++) {
            jLabelArray[i] = new JLabel(colorsInString[i]);
            jLabelArray[i].setBackground(Color.WHITE);
            jLabelArray[i].setForeground(colorsInColor[i]);
            jLabelArray[i].setBorder(new LineBorder(Color.YELLOW));
            jLabelArray[i].setFont(new Font("Times Roman", Font.BOLD, 20));
            jLabelArray[i].setToolTipText(colorsInString[i]);
            add(jLabelArray[i]);
        }
    }

    public static void main(String[] args) {
        // Create main frame
        Lab_128_SwingCommonFeatures frame = new Lab_128_SwingCommonFeatures();
        frame.setTitle("Excercise12_8");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
