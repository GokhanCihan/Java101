// Determines Body Mass Index of user
// User provides weight in kg and height in m

import java.util.Scanner;

public class BodyMassIndexMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, height, bmi;

        System.out.print("Your height in m: ");
        height = input.nextDouble();

        System.out.print("Your weight in kg: ");
        weight = input.nextDouble();

        bmi = (weight / height) / height;

        System.out.println("Your BMI is: " + bmi);
    }
}
