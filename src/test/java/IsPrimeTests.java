import org.junit.jupiter.api.Test;

public class IsPrimeTests {
    @Test
    public void isPrimeCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPrime",true,new Object[]{7}, true);
    }

    @Test
    public void isPrimeCorrect2(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPrime",true,new Object[]{1237}, true);
    }

    @Test
    public void isPrimeIncorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPrime",false, new Object[]{369}, true);
    }

    @Test
    public void isPrimeZero(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPrime",false, new Object[]{0}, true);
    }

    @Test
    public void isPrimeOne(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPrime",true, new Object[]{1}, true);
    }

    @Test
    public void isPrimeTwo(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPrime",true, new Object[]{2}, true);
    }
}
