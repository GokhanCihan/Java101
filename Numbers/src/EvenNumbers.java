import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

       do {
           System.out.print("Provide an even number for calculation ");
           System.out.print("or an odd number to finish execution: ");
           number = input.nextInt();

           if (number % 4 == 0) {
               sum += number;
           }

       }while (number % 2 == 0);

        System.out.println("Sum of the numbers: " + sum);

    }
}