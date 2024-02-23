// asks user an integer number
// checks whether it is a perfect number or not

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int givenNumber, sum;
        sum = 0;

        // ask number
        System.out.println("which number you would like to check? ");
        givenNumber = input.nextInt();

        // check perfectness
        for (int i = 1; i < givenNumber; i++) {
            if (givenNumber % i == 0) {
                sum += i;
            }
        }
        if ( sum == givenNumber ) {
            System.out.println(givenNumber + " is a perfect number!");
        }else {
            System.out.println(givenNumber +  " is not a perfect number!");
        }
    }
}
