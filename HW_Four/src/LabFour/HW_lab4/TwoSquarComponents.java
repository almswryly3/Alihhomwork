package LabFour.HW_lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TwoSquarComponents extends JComponent {
    public void paintComponent(Graphics g){
        Rectangle r=new Rectangle(100,100,100,100);
        Graphics2D g2=(Graphics2D) g;
        g2.fill(r);
        Rectangle2D.Double square1=new Rectangle2D.Double(25,25,200,200);
        g2.setColor(Color.pink);
        g2.fill(square1);
        Rectangle2D.Double square2=new Rectangle2D.Double(300,25,200,200);
        g2.setColor(Color.MAGENTA);
        g2.fill(square2);


    }
}
