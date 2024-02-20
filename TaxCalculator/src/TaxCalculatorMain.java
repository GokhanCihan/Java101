// This program calculates amount of VAT (TR: KDV) added to an item's price
// Item price to be given by user input
// Warning: This is not a tool. Do not use for financial calculations!

import java.util.Scanner;

public class TaxCalculatorMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price, rate, vat, totalPrice;

        // ask price
        System.out.print("input a price for calculation: ");
        price = input.nextFloat();

        // calculations
        rate = (price <= 1000) ? 0.18f : 0.08f;
        vat = rate * price;
        totalPrice = price + vat;

        // output
        System.out.println("\nprice: " + price + "TL");
        System.out.println("VAT: " + "(" + (rate * 100) + "%) " + vat + "TL");
        System.out.println("VAT-included price: " + totalPrice + "TL");
    }

}
