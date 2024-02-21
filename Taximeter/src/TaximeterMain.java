// Calculate payment required for distance traveled by a taxi
// User provides distance traveled

import java.util.Scanner;

public class TaximeterMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double COST_PER_KM = 2.20;
        final double INITIAL_COST = 10;
        final double PAYMENT_FLOOR = 20;
        double distance, payment;

        System.out.print("How much did you travel in km: ");
        distance = input.nextDouble();

        payment = INITIAL_COST + ( distance * COST_PER_KM );

        if (payment <= PAYMENT_FLOOR) {
            System.out.println("payment required: " + PAYMENT_FLOOR + "TL");
        }else {
            System.out.println("payment required: " + payment + "TL");
        }

    }
}
