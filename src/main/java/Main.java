public class Main {
    public static void main(String[] args) {
    }

    public static void printRange(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }

    public static int sumDivisible(int from, int to, int divisor) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            if (i % divisor == 0)
                sum += i;
        }
        return sum;
    }

    public static int getFactorial(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    public static boolean isPalindrome(String text) {
        String s = text.toLowerCase();
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(int num) {
        if(num == 0)
            return false;

        if(num == 1 || num == 2)
            return true;

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


}
