import java.util.Scanner;
import java.util.Arrays;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isCorrect = false;
        boolean isWrong = false;

        System.out.println(number);
        while (5 - guess > 0) {
            System.out.print("Guess the number: ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("You need to guess a number between 0 and 100");
            } else if(selected == number) {
                System.out.println("Correct ! The number was indeed " + number);
                isCorrect = true;
                break;
            } else {
                System.out.println("Wrong!! Look at this information and make a guess again.");
                if (selected > number) {
                    System.out.println("The number is lower than " + selected);
                } else {
                    System.out.println("The number is greater than " + selected);
                }

                wrong[guess++] = selected;
                System.out.println("Remaining guesses: " + (5 - guess));
            }
        }

        if (!isCorrect) {
            System.out.println("You lose :((((");
            if (!isWrong) {
                System.out.println("Guesses you made: " + Arrays.toString(wrong));
            }
        }
    }
}
