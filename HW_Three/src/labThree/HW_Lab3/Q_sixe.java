package labThree.HW_Lab3;

import java.util.Scanner;

public class Q_sixe {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter Three Numbers :");
        int x= in.nextInt();
        int y= in.nextInt();
        int z= in.nextInt();

        if(x<y&&y<z)
        {
            System.out.println("Increasing");
        } else if(x>y&&y>z){
            System.out.println("Decreasing");
        } else System.out.println("Neither");

    }
}
