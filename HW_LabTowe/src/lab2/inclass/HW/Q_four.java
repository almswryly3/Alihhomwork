package lab2.inclass.HW;

import java.util.Scanner;

public class Q_four {
    public static void main(String[] args) {
        double x,y,z,w,sum,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Three numbers :");
        x= in.nextDouble();
        y= in.nextDouble();
        z= in.nextDouble();
        w= in.nextDouble();
        sum=x+y+z+w;
        avg=sum/4;
        System.out.println("average ="+avg);
    }
}
