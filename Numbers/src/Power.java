// Finds exponents of given positive number

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, exponent;
        int result = 1;

        System.out.print("Provide an integer for the base: ");
        base = input.nextInt();

        System.out.print("Provide a positive integer for the exponent: ");
        exponent = input.nextInt();

        for (int i=1; i <= exponent; i++) {
            result *= base;
        }

        System.out.print("Result: " + result);
    }
}