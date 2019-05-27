import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 27.05.2019.
 */
public class Lab_131_DisplayA3x3Grid extends JFrame {
    public Lab_131_DisplayA3x3Grid() {
        add(new NewPanel());
    }

    public static void main(String[] args) {
        Lab_131_DisplayA3x3Grid frame = new Lab_131_DisplayA3x3Grid();
        frame.setTitle("Excercise13_1");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class NewPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(0, 50, 300, 50);
        g.drawLine(0, 100, 300, 100);
        g.setColor(Color.RED);
        g.drawLine(100, 0, 100, 200);
        g.drawLine(200, 0, 200, 200);
    }
}
