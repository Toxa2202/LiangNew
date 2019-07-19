package exercise01;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anton.sviatov on 19.07.2019.
 */
public class Exercise01 extends JFrame {
    public Exercise01() {
        setLayout(new FlowLayout());
        add(new drawSquare());
        add(new drawSin());
        add(new drawCos());
        add(new drawTan());
        add(new drawFun1());
        add(new drawFun2());
        add(new drawFun3());
    }

    public static void main(String[] args) {
        Exercise01 frame = new Exercise01();
        frame.setSize(1500, 800);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("exercise01");
        frame.setVisible(true);
    }
}

class drawSquare extends AbstractDrawFunction {

    @Override
    double f(double x) {
        return x * x * 0.1;
    }
}

class drawSin extends AbstractDrawFunction {

    @Override
    double f(double x) {
        return 50 * Math.sin((x / 100.0) * 2 * Math.PI);
    }
}

class drawCos extends AbstractDrawFunction {

    @Override
    double f(double x) {
        return 50 * Math.cos((x / 100.0) * 2 * Math.PI);
    }
}

class drawTan extends AbstractDrawFunction {

    @Override
    double f(double x) {
        return 50 * Math.tan((x / 100.0) * 2 * Math.PI);
    }
}

class drawFun1 extends AbstractDrawFunction {

    @Override
    double f(double x) {
        return 50 * Math.cos((x / 100.0) * 2 * Math.PI) + 5 * 50 * Math.sin((x / 100.0) * 2 * Math.PI);
    }
}

class drawFun2 extends AbstractDrawFunction {

    @Override
    double f(double x) {
        return 5 * 50 * Math.cos((x / 100.0) * 2 * Math.PI) + 50 * Math.sin((x / 100.0) * 2 * Math.PI);
    }
}

class drawFun3 extends AbstractDrawFunction {

    @Override
    double f(double x) {
        return Math.log(x * 0.01) + x * x * 0.01;
    }
}
