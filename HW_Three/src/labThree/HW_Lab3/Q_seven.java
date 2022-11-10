package labThree.HW_Lab3;

import java.util.Scanner;

public class Q_seven {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter Three Numbers :");

        int x= in.nextInt();

        int y= in.nextInt();

        int z= in.nextInt();

        if(x<y&&y<z) System.out.println("In Order");

        if(x>y&&y>z) System.out.println("In Order");

        if(x<y&&y==z)System.out.println("In Order");

        if(x<y&&y>z)System.out.println("Not In Order");
    }
}
