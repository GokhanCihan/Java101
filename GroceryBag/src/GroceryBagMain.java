// Calculates amount you need to pay for your grocery bag
// Provide number of items in your bag

import java.util.Scanner;

public class GroceryBagMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] itemTypes =  { "pears", "apples", "tomatoes", "bananas", "eggplants" };
        double[] pricePerItem = { 2.14, 3.67, 1.11, 0.95, 5.00 };

        int[] itemCounts = new int[itemTypes.length];
        double totalPrice = 0;

        // ask item count for each item
        for (int i = 0; i < itemTypes.length; i++) {
            System.out.print("amount of " + itemTypes[i] + " in your bag: ");
            itemCounts[i] = input.nextInt();
        }

        // calculate total price
        for (int i = 0; i < itemTypes.length; i++) {
            totalPrice += pricePerItem[i] * itemCounts[i];
        }

        System.out.println("------------------------");
        System.out.println("Total price is " + totalPrice +"TL");
        System.out.println("------------------------");
    }
}