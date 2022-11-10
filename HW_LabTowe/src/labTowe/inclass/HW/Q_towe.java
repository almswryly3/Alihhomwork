package labTowe.inclass.HW;

import java.util.Scanner;

public class Q_towe {
    public static void main(String[] args) {

        double perimeter,r,area;
        System.out.println("print perimeter and area of circle");
        System.out.println("______________________________________________________________");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        r= in.nextDouble();
        perimeter=2*(22.0/7.0)*r;
        System.out.println("Perimeter ="+perimeter);
        System.out.println("________________________________________________________-");
        area=(22.0/7.0)*r*r;
        System.out.println("Area ="+area);
    }
}
