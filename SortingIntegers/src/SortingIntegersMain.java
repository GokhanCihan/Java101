// asks user three integers
// sorts them greatest to lowest

import java.util.Scanner;

public class SortingIntegersMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, thirdNumber;
        int greatest, middle, lowest;

        // ask integers
        System.out.println("Type the first integer: ");
        firstNumber = input.nextInt();
        System.out.println("Type the second integer: ");
        secondNumber = input.nextInt();
        System.out.println("Type the third integer: ");
        thirdNumber = input.nextInt();

        // find the greatest integer first
        // then compare the other two
        if ((firstNumber >= secondNumber ) && (firstNumber >= thirdNumber)) {
            greatest = firstNumber;
            if (secondNumber > thirdNumber) {
                middle = secondNumber;
                lowest = thirdNumber;
            } else {
                middle = thirdNumber;
                lowest = secondNumber;
            }
        } else if (secondNumber >= thirdNumber) {
            // the second is the greatest
            greatest = secondNumber;
            if (thirdNumber > firstNumber) {
                middle = thirdNumber;
                lowest = firstNumber;
            } else {
                middle = firstNumber;
                lowest = thirdNumber;
            }
        } else {
            greatest = thirdNumber;
            if (secondNumber > firstNumber){
                middle = secondNumber;
                lowest = firstNumber;
            }else {
                middle = firstNumber;
                lowest = secondNumber;
            }

        }

        System.out.println("sorted: " + greatest + " >= " + middle + " >= " + lowest);
    }
}
