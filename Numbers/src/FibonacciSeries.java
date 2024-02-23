import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length;
        int previousNumber = 0;
        int currentNumber = 1;
        int nextNumber;

        System.out.println("Provide length of the series you want to create: ");
        length = input.nextInt();

        // print first two number of the series
        System.out.print(previousNumber + " " + currentNumber);

        // update and print next number in the series
        for (int i = 3; i <= length; i++) {
            nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            System.out.print(" " + nextNumber);
        }

    }
}
