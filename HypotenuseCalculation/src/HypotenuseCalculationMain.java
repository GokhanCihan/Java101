// Calculates hypotenuse, the side opposite to the right (90 degree) angle, in a triangle
// User input provides length of other two sides

import java.util.Scanner;

public class HypotenuseCalculationMain {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lengthA, lengthB, hypotenuse;
        double squareSum;

        System.out.print("provide the length of side A: ");
        lengthA = input.nextFloat();

        System.out.print("provide the length of side B: ");
        lengthB = input.nextFloat();

        // find sum of squares of each side then find the square root
        squareSum = Math.pow(lengthA, 2) + Math.pow(lengthB, 2);
        hypotenuse = Math.pow(squareSum, 0.5);

        System.out.println();
        System.out.println("side A: " + lengthA);
        System.out.println("side B: " + lengthB);
        System.out.println("hypotenuse: " + hypotenuse);
    }
}
