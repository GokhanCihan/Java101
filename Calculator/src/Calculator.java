// User provides two integer to make operations
// then provides another integer to select the corresponding arithmetic operator

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        switch (selection()) {
            case 1 -> addition();
            case 2 -> subtraction();
            case 3 -> multiplication();
            case 4 -> division();
            case 5 -> power();
            case 6 -> factorial();
            default -> wrongSelectionMessage();
        }
    }

    static int selection() {
        Scanner scanner = new Scanner(System.in);
        int selection;
        System.out.println(" Please select one of the following functions.");
        System.out.println("""
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Raise power
                6- Factorial
                """);
        selection = scanner.nextInt();
        return selection;
    }

    static void addition() {
        int result, firstNumber, secondNumber;

        firstNumber = askNumber();
        secondNumber = askNumber();

        result = firstNumber + secondNumber;
        resultMessage(result);
    }

    static void subtraction() {
        int result, firstNumber, secondNumber;

        firstNumber = askNumber();
        secondNumber = askNumber();

        result = firstNumber - secondNumber;
        resultMessage(result);
    }

    static void multiplication() {
        int result, firstNumber, secondNumber;

        firstNumber = askNumber();
        secondNumber = askNumber();

        result = firstNumber * secondNumber;
        resultMessage(result);
    }

    static void division() {
        double result = 0, firstNumber, secondNumber;

        firstNumber = askNumber();
        secondNumber = askNumber();

        if (secondNumber == 0) {
            System.out.println("Division by 0 is not allowed. Restart program.");
        } else {
            result = firstNumber / secondNumber;
        }
        resultMessage(result);
    }

    static void power() {
        int result = 1;
        int base, exponent;

        base = askNumber();
        exponent = askNumber();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        resultMessage(result);
    }

    static void factorial() {
        int result = 1, number;

        number = askNumber();

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        resultMessage(result);
    }

    static int askNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("provide a number: ");
        return scanner.nextInt();
    }

    static void resultMessage(double result) {
        System.out.println("result: " + result);
    }

    static void wrongSelectionMessage() {
        System.out.println("Allowed selections are 1, 2, 3, 4, 5 or 6. Try again");
    }

}
