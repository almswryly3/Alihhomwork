package labThree.HW_Lab3;

import java.util.Scanner;

public class Q_three {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number :");
        int x= in.nextInt();
        if(x>0)
            System.out.println("posit");
        else if(x<0)
            System.out.println("negati");
        else if(x==0)
            System.out.println("Zeeeero");
    }
}
