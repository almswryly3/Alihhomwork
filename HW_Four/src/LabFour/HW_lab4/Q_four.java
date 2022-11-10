package LabFour.HW_lab4;

import java.awt.*;

public class Q_four {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println(box);
        System.out.println("The actual answer ="+(box.getHeight()+box.getWidth()));
        System.out.println("The expected answer ="+ (25+40));
    }
}
