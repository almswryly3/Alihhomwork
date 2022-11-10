package HW_lab5.Tally;

import HW_lab5.Tally.TallyCounter;

public class TestCounter {
    public static void main(String[] args) {

        TallyCounter x=new TallyCounter();
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        x.undo();
        x.undo();
        x.undo();

        System.out.println(x.getClick());




    }
}
