// Determines if provided year is whether a leap year or not

import java.util.Scanner;

public class LeapYearMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        boolean isLeapYear;

        System.out.print("Provide a year: ");
        year = input.nextInt();

        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0){
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println("Year " + year + " is a leap year.");
        } else {
            System.out.println("Year " + year + " is not leap year.");
        }
    }
}
