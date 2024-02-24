// Draw reverse triangle with a user provided dimension

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dimension;

        System.out.print("Provide triangle's dimension: ");
        dimension = input.nextInt();

        // start of a new line
        for (int line = 1; line <= dimension; line++) {
            // draw " " for current line
            for(int star = 1; star <=  (dimension - line); star++) {
                System.out.print(" ");
            }
            // "*"
            for(int star = 1; star <= (2 * line) - 1; star++){
                System.out.print("*");
            }
            // end of line
            System.out.println();
        }

        // start of a new line
        for (int line = dimension; line > 0; line--) {
            for(int star = 1; star <=  (dimension - line); star++) {
                System.out.print(" ");
            }
            // draw "*" for current line
            for(int star = 1; star <= (2 * line) - 1; star++){
                System.out.print("*");
            }
            // end of line
            System.out.println();
        }
    }
}
