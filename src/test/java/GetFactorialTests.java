import org.junit.jupiter.api.Test;

public class GetFactorialTests {

    @Test
    public void getFactorialCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"getFactorial",720,new Object[]{6}, true);
    }

    @Test
    public void getFactorialCorrect2(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"getFactorial",24,new Object[]{4}, true);
    }

    @Test
    public void getFactorialOne(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"getFactorial",1,new Object[]{1}, true);
    }
}
