package labThree.HW_Lab3;

import java.util.Scanner;

public class Q_four {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number :");
        long n= in.nextLong();
        if(n < 0)
        {
            n*= -1;
        }
        int digits ;

        if(n>999999999)
        {
            digits= 10;

        }
        else if(n>99999999)
        {
            digits= 9;

        }
        else if(n>9999999)
        {
            digits= 8;

        }
        else if(n>999999)
        {
            digits= 7;

        }
        else if(n>99999)
        {
            digits= 6;

        }
        else if(n>9999)
        {
            digits= 5;

        }
        else if(n>999)
        {
            digits= 4;

        }
        else if(n>99)
        {
            digits= 3;

        }
        else if(n>9)
        {
            digits= 2;

        }
        else
        {
            digits= 1;
        }

        System.out.println("number "+n+ " has:"+ digits+" digits" );
    }
}
