package LabFour.HW_lab4;

import javax.swing.*;

public class TwoSquareViewer {
    public static void main(String[] args) {
        JFrame s=new JFrame("My frame");
        s.setSize(600,600);
        TwoSquarComponents t = new TwoSquarComponents();
        s.add(t);
        s.setVisible(true);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
