// Draw reverse triangle with a user provided dimension

import java.util.Scanner;

public class ReverseTriangleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dimension;

        System.out.println("Provide triangle's dimension: ");
        dimension = input.nextInt();

        // start of a new line
        for (int line = dimension; line > 0; line--) {
            // draw "*" for current line
            for(int star = 1; star <= (2 * line) - 1; star++){
                System.out.print("*");
            }
            // end of line
            System.out.println();
        }
    }
}
