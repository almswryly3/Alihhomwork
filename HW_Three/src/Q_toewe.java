package lab3.HW_Lab3;

import java.util.Scanner;

public class Q_toewe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number and letter :");
        int n;
        char chess=0 ;
        n = in.nextInt();
        if (n % 2 == 0) {
            if (chess == 'a' || chess == 'c' || chess == 'e' || chess == 'g') {
                System.out.println("black");

            } else {
                System.out.println("white");
            }

        } else {
            if (n % 2 == 1){
                System.out.println("black");
            } else {
                System.out.println("white");
            }
        }

    }
}
