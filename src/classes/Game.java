package classes;

public class Game {
    public static String playFizzBuzz(int x) {
        if (x % 15 == 0) {
            return "FizzBuzz";
        } else if (x % 3 == 0) {
            return  "Fizz";
        } else if (x % 5 == 0 ) {
            return "Buzz";
        } else {
           return Integer.toString(x);
        }
    }

    public static String useTernaryAndPlayFizzBuzz(int x) {
        return x % 15 == 0 ? "FizzBuzz" : x % 3 == 0 ? "Fizz" : x % 5 == 0 ? "Buzz" : String.valueOf(x);
    }
}
