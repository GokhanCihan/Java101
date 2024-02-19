// ask user for exam results
// calculate semester average to decide "fail" or "success"

import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] courses = {
                "Applied Physics",
                "Mathematical Analysis",
                "Organic Chemistry",
                "Turkish Literature",
                "Medieval Music"
        };
        double[] results = new double[courses.length];
        double semesterAverage;
        double sum = 0;

        // ask for input
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Add your exam result for " + courses[i] + ":");
            results[i] = input.nextDouble();
        }

        for (double result : results) {
            sum += result;
        }

        semesterAverage = sum / results.length;

        String grade = (semesterAverage >= 60) ? "SUCCESS" : "FAIL";

        System.out.println(grade);
    }
}
