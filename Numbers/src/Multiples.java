// Asks user a number
// Finds the average of multiples of both 3 and 4 up to given number

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        float average;

        System.out.print("Provide a number: ");
        number = input.nextInt();

        // find multiples of 12
        for (int i = 1; i < number; i++) {
            if ( i % 12 == 0) {
                sum += i;
                count++;
            }
        }

        average = (float) sum / count;
        System.out.println("The average is " + average);

    }
}
