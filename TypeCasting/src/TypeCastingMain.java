/* Asks user an integer and a floating number (double)
   Casts integer to a floating number and floating number to an integer */

import java.util.Scanner;

public class TypeCastingMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intNumber, madeInt;
        double dNumber, madeDouble;

        System.out.print("Provide an integer: ");
        intNumber = input.nextInt();

        System.out.print("Provide a floating number: ");
        dNumber = input.nextDouble();

        // type casting
        madeInt = (int) dNumber;
        madeDouble = intNumber;

        System.out.println("Integer " + intNumber + " converted to double: " + madeDouble);
        System.out.println("Integer " + dNumber + " converted to integer: " + madeInt);
    }
}