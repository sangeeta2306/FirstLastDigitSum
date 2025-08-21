public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(sumFirstAndLastDigit(45));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if(number < 0) {
            return -1;
        } else {
            sum = number % 10; // last digit.
            while(number >= 10) {
                number = number / 10;
            }
            sum = sum + number;
            return sum;
        }
    }

}
