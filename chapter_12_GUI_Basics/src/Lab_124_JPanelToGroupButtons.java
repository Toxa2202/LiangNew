import javax.swing.*;
import java.awt.*;

public class Lab_124_JPanelToGroupButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        frame.setTitle("Excercise 12_4");
        frame.setSize(650, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GroupButtons(1));
        frame.add(new GroupButtons(4));
        frame.setVisible(true);
    }
}

class GroupButtons extends JPanel {
    public GroupButtons(int number) {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        add(new JButton("Button " + number++));
        add(new JButton("Button " + number++));
        add(new JButton("Button " + number));
    }
}
