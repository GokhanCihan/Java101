// Calculates price of a plane ticket
// Applies discount according to the age and travel type of user

import java.util.Scanner;

public class FlightTicketMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance, age, travelType;
        double totalPrice;
        final double PRICE_PER_KM = 0.10;

        System.out.print("Distance in km: ");
        distance = input.nextInt();

        System.out.print("Your age: ");
        age = input.nextInt();

        System.out.println("Choose travel type:");
        System.out.println("1 => one-way");
        System.out.println("2 => round-trip");
        travelType = input.nextInt();

        totalPrice = distance * PRICE_PER_KM;

        if (age <= 0 || distance <= 0 || travelType < 1 || travelType > 2 ) {
            System.out.println("*** Invalid input! ***");

        }else {
            // apply age discount
            if (age <= 12) {
                totalPrice = totalPrice * (1 - 0.5);
            }else if (age <= 24) {
                totalPrice = totalPrice * (1- 0.1);
            }else if (age >= 65) {
                totalPrice = totalPrice * (1 - 0.3);
            }else {
                totalPrice = totalPrice * 1;
            }

            // apply travel type discount
            if (travelType == 2) {
                totalPrice = 2 * totalPrice * (1 - 0.2);
            }

            System.out.println("Total ticket price: " + totalPrice + "TL");
        }
    }
}
