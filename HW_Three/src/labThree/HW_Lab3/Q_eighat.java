package labThree.HW_Lab3;

import java.util.Scanner;

public class Q_eighat {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name and salary of employee :");
        String name= in.next();
        Double sal=9.25;
        int hour=40;
        Double overtime= in.nextDouble();
        overtime=sal+(sal*1.5);
        sal=hour*sal;
        System.out.println(overtime);
        System.out.println(sal);


    }
}
