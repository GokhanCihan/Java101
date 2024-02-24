
import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        double seriesSum = 1.0;

        System.out.println("Provide a number: ");
        number = scanner.nextInt();

        for (double i = 1; i <= number; i++) {
            seriesSum += 1 / i;
        }

        System.out.println(seriesSum);
    }
}
