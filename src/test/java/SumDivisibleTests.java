import org.junit.jupiter.api.Test;

public class SumDivisibleTests {

    @Test
    public void sumDivisibleCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"sumDivisible",21,new Object[]{6,15,7}, true);
    }

    @Test
    public void sumDivisibleZero(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"sumDivisible",0,new Object[]{23,40,73}, true);
    }

    @Test
    public void sumDivisibleEmptyRange(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"sumDivisible",0,new Object[]{45,33,3}, true);
    }
}
