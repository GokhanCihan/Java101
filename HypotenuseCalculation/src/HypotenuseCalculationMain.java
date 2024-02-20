// Calculates hypotenuse, the side opposite to the right (90 degree) angle
// and the area in a right-angled triangle
// User input provides length of other two sides

import java.util.Scanner;

public class HypotenuseCalculationMain {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lengthA, lengthB, hypotenuse, area;

        System.out.print("provide the length of side A: ");
        lengthA = input.nextFloat();
        System.out.print("provide the length of side B: ");
        lengthB = input.nextFloat();

        hypotenuse = calculateHypotenuse(lengthA, lengthB);
        area = calculateArea(lengthA, lengthB);

        System.out.println();
        System.out.println("side A: " + lengthA);
        System.out.println("side B: " + lengthB);
        System.out.println("hypotenuse: " + hypotenuse);
        System.out.println("area: " + area);
    }

    public static double calculateHypotenuse(double lengthA, double lengthB) {
        double squareSum, hypotenuse;
        // find sum of squares of each side then find the square root
        squareSum = Math.pow(lengthA, 2) + Math.pow(lengthB, 2);
        hypotenuse = Math.pow(squareSum, 0.5);

        return hypotenuse;
    }

    public static double calculateArea(double lengthA, double lengthB) {
        return (lengthA * lengthB) / 2;
    }
}
