// Asks user two integers
// Finds highest and lowest common factors

import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne, numberTwo, limitingNumber;
        int highestCF = 1;
        int lowestCF;

        System.out.print("1. integer: ");
        numberOne = scanner.nextInt();

        System.out.print("2. integer: ");
        numberTwo = scanner.nextInt();

        limitingNumber = (numberOne > numberTwo) ? numberTwo : numberOne;

        // decrement limiting number until gcf is found
        while (limitingNumber > 0) {
            if ((numberOne % limitingNumber == 0) && (numberTwo % limitingNumber == 0)) {
                highestCF = limitingNumber;
                limitingNumber = 0;
            }else {
                limitingNumber--;
            }
        }

        lowestCF = (numberOne * numberTwo) / highestCF;

        System.out.println("==================================");
        System.out.println("The highest common factor: " + highestCF);
        System.out.println("The lowest common factor: " + lowestCF);
    }
}