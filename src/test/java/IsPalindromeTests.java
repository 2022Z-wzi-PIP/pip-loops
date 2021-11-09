import org.junit.jupiter.api.Test;

public class IsPalindromeTests {

    @Test
    public void isPalindromeCorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPalindrome",true,new Object[]{"anna"}, true);
    }

    @Test
    public void isPalindromeCorrect2(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPalindrome",true,new Object[]{"alaamaala"}, true);
    }

    @Test
    public void isPalindromeUpperCase(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPalindrome",true,new Object[]{"Gallag"}, true);
    }

    @Test
    public void isPalindromeIncorrect(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPalindrome",false,new Object[]{"RUSLAN"}, true);
    }

    @Test
    public void isPalindromeEmpty(){
        Main main = GenericTestFactory.getInstance(Main.class);
        GenericTestFactory.testMethod(main,"isPalindrome",true,new Object[]{""}, true);
    }
}
