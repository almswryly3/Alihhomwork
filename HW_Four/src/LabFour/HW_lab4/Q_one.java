package LabFour.HW_lab4;

import java.awt.*;

public class Q_one {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(3,4);
        System.out.println("actual perimeter :"+ (2*r.getWidth()+ 2*r.getHeight()));
        System.out.println("expected perimeter :"+  (2*3+2*4));
    }
}
