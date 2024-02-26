// Find value of nth element in the Fibonacci Series

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length;

        System.out.print("Provide length of the series you want to create: ");
        length = input.nextInt();

        System.out.println(length + ". element in the series: " + fibonacciSeries(length));
    }
    public static int fibonacciSeries(int length) {
        if ((length == 1) || (length == 2)) {
            return 1;
        }else {
            return  fibonacciSeries(length-1) + fibonacciSeries(length-2);
        }
    }
}
