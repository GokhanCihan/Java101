// Calculate area for a given circle segment
// User provides radius and angle of the segmented area

import java.util.Scanner;

public class CircleSegmentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        double radius, angle, segmentArea;

        System.out.print("radius of the circle segment is: ");
        radius = input.nextDouble();

        System.out.print("center angle of the circle segment is: ");
        angle = input.nextDouble();

        segmentArea = PI * (radius * radius) * 0.5;

        System.out.println("\n----------------------------");
        System.out.println("Radius: " + radius + " m");
        System.out.println("Angle: " + angle + " degree");
        System.out.println("Area: " + segmentArea + " square m");
        System.out.println("-----------------------------");

    }
}
