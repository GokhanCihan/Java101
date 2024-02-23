// Finds minimum and maximum number
// from the numbers given by the user

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min, max, givenNumber, numberCount;
        min = 0;
        max = 0;

        // ask user the count of numbers to be provided
        System.out.print("How many numbers you want to provide? ");
        numberCount = input.nextInt();

        // ask each number in turn
        for (int i = 1; i <= numberCount; i++) {
            System.out.print("Please provide the " + i + ". number: ");
            givenNumber = input.nextInt();
            // compare input to min and max number
            if (givenNumber >= max) {
                max = givenNumber;
            }
            if (givenNumber <= min) {
                min = givenNumber;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
