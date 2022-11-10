package labThree.HW_Lab3;

import java.util.Scanner;

public class Q_five {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        int x= in.nextInt();
        int y= in.nextInt();
        int z= in.nextInt();

        if(x==y&&x==z) {
            System.out.println("All The Same");

        }
        else if (x != y && x != z&&y!=z)
        {
            System.out.println("All Different");

        }else System.out.println("Neither");
    }
}
