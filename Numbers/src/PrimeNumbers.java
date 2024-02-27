// Finds prime numbers between 1 and 100

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number;

        number = askNumber();
        System.out.println(isPrime(number));
    }

    static int askNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide an integer: ");
        return scanner.nextInt();
    }
    
    static boolean isPrime(int number) {
        return checkNotDividable(number, 2);
    }

    // increment divisor
    // if divisor reaches to the number it means that
    // the number is not dividable other than itself
    static boolean checkNotDividable(int number, int divisor) {
        if (divisor == number) {
            return true;
        } else {
            if (number % divisor == 0) {
                return false;
            }
            return checkNotDividable(number, divisor + 1);
        }
    }
}
