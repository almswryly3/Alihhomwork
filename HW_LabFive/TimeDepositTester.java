package HW_lab5.TimeDeposit;

import HW_lab5.TimeDeposit.TimeDepositAccount;

public class TimeDepositTester {
    public static void main(String[] args) {
        TimeDepositAccount x=new TimeDepositAccount(1000,5);

        x.addInterest();
        System.out.println(x.getBalance());
        x.withdraw();
        System.out.println(x.getBalance());
    }
}
