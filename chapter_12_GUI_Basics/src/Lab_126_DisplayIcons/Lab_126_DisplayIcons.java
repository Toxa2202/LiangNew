package Lab_126_DisplayIcons;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import javax.swing.ImageIcon;

public class Lab_126_DisplayIcons extends JFrame {

    public Lab_126_DisplayIcons() {
        setLayout(new GridLayout(2, 2, 0, 0));
        // Did not see images. Must to provide whole path to those images
        JLabel jlbl1 = new JLabel(new ImageIcon("resources/images/flags/england.jpg"));
        JLabel jlbl2 = new JLabel(new ImageIcon("resources/images/flags/france.jpg"));
        JLabel jlbl3 = new JLabel(new ImageIcon("resources/images/flags/norway.jpg"));
        JLabel jlbl4 = new JLabel(new ImageIcon("resources/images/flags/puertorico.jpg"));

        jlbl1.setBorder(new LineBorder(Color.BLACK));
        jlbl2.setBorder(new LineBorder(Color.BLACK));
        jlbl3.setBorder(new LineBorder(Color.BLACK));
        jlbl4.setBorder(new LineBorder(Color.BLACK));

        add(jlbl1);
        add(jlbl2);
        add(jlbl3);
        add(jlbl4);
    }

    public static void main(String[] args) {
        Lab_126_DisplayIcons frame = new Lab_126_DisplayIcons();
        frame.setTitle("Excercise 12_6");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
