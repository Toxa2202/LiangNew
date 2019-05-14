import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Lab_125_DisplayLabels extends JFrame {

    public Lab_125_DisplayLabels() {
        setLayout(new GridLayout(4, 0, 0, 0));
        JTextField textField1 = new JTextField("Department of Computer Science");
        JTextField textField2 = new JTextField("School of Computing");
        JTextField textField3 = new JTextField("Armstrong Atlantic State University");
        JTextField textField4 = new JTextField("Tel: (912) 921-6440");

        textField1.setBorder(new LineBorder(Color.black));
        textField2.setBorder(new LineBorder(Color.black));
        textField3.setBorder(new LineBorder(Color.black));
        textField4.setBorder(new LineBorder(Color.black));

        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);
    }

    public static void main(String[] args) {
        Lab_125_DisplayLabels frame = new Lab_125_DisplayLabels();
        frame.setTitle("Excercise 12_5");
        frame.setSize(300, 120);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
