package HW_lab5.Mystery;

import HW_lab5.Mystery.bankMystery;

public class MysteryTester {
    public static void main(String[] args) {
        bankMystery ahmed=new bankMystery(500);
        bankMystery Saeed=new bankMystery(1000);
       //calling mystery method
        Saeed.mystery(ahmed,500);
        System.out.println("mohammed balance="+Saeed.getBalance());
        System.out.println("Ahmed balance="+ahmed.getBalance());
    }
}