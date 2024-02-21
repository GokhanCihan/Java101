// User provides two integer to make operations
// then provides another integer to select the corresponding arithmetic operator

import java.util.Scanner;

public class WeirdCalculatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, selected;

        // ask user for integers
        System.out.print("Provide the first integer: ");
        firstNumber = input.nextInt();
        System.out.print("Provide the second integer: ");
        secondNumber = input.nextInt();

        // ask user for selection
        System.out.println("-------------------------------------");
        System.out.println("Type 1 to calculate summation");
        System.out.println("Type 2 to calculate subtraction");
        System.out.println("Type 3 to calculate multiplication");
        System.out.println("Type 4 to calculate division");
        System.out.println("-------------------------------------");
        selected = input.nextInt();

        // calculate selected operation
        switch (selected) {
            case 1:
                System.out.println("Summation: result is " + (firstNumber + secondNumber) );
                break;
            case 2:
                System.out.println("Subtraction: result is " + (firstNumber - secondNumber) );
                break;
            case 3:
                System.out.println("Multiplication: result is " + (firstNumber * secondNumber) );
                break;
            case 4:
                if (secondNumber == 0){
                    System.out.println("Division by 0 is not allowed. Restart program.");
                }else {
                    System.out.println("Division: result is " + (firstNumber / secondNumber) );
                }
                break;
            default:
                System.out.println("You typed: " + selected + ". Allowed selections are 1, 2, 3 or 4.");
                break;
        }

    }
}
