// Finds power of given number using a static method recursively

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int base, exponent;

        base = askBaseNumber();
        exponent = askExponent();

        System.out.print("Result: " + power(base, exponent));
    }

    // step down to function's 1st element: f(0) => 1
    // step up to function's last element: f(n) => n * f(n-1)
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    static int askBaseNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide an integer for the base: ");
        return scanner.nextInt();
    }

    static int askExponent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide an integer for the exponent: ");
        return scanner.nextInt();
    }
}