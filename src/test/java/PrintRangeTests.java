import org.junit.jupiter.api.Test;

public class PrintRangeTests {

    @Test
    public void printRangeCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testSystemOutputFromMethod(main,"printRange","6 7 8 9", new Object[]{6,9}, true);
    }

    @Test
    public void printRangeNegative(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testSystemOutputFromMethod(main,"printRange","-10 -9 -8", new Object[]{-10,-8}, true);
    }

    @Test
    public void printRangeEmpty(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testSystemOutputFromMethod(main,"printRange","", new Object[]{12,10}, true);
    }


}
