
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, remainder, decimalCheck;
        int digits = 0;
        int power = 1;
        int sum = 0;

        System.out.print("The number you want to check for: ");
        number = scanner.nextInt();
        decimalCheck = number;

        // find count of digits
        while (decimalCheck != 0){
            decimalCheck = decimalCheck / 10;
            digits++;
        }

        decimalCheck = number;
        for (int i=1; i <= digits; i++) {
            // find the digit the find its power
            remainder = decimalCheck % 10;
            for (int j = 1; j <= digits; j++) {
               power *= remainder;
            }
            // add powers to sum
            sum +=  power;
            power = 1;

            // passing in to the next decimal
            decimalCheck /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number!");
        }else {
            System.out.println(number + " is not an Armstrong number!");
        }
    }
}


