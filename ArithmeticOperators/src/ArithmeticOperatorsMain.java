// User gives 3 numbers
// Does some arithmetics with these numbers

import java.util.Scanner;

public class ArithmeticOperatorsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, result;

        System.out.print("provide number a: ");
        a = input.nextInt();

        System.out.print("provide number b: ");
        b = input.nextInt();

        System.out.print("provide number c: ");
        c = input.nextInt();

        result = a + (b * c) -b;

        System.out.print("result of the mysterious arithmetic operation is: " + result);
    }
}
