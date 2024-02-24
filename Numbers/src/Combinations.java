// Given a set of n elements
// finds the number of r-combinations: C(n, r)
// C(n, r) = n! / ( r! (n-r)! )

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n, r;
        long combination;
        long factorial = 1;

        System.out.print("Number of elements in the set (n<=20): ");
        n = input.nextInt();

        System.out.print("What combinations of " + n + " you want to calculate: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        // save factorial and reset
        combination = factorial;
        factorial = 1;

        for (int i = 1; i <= r; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        combination = combination / factorial;
        factorial = 1;

        for (int i =1; i<= (n - r); i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        combination = combination / factorial;


        System.out.println(r + "-combinations of " + n + ": " + combination);

    }
}