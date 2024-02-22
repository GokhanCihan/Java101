// Ask user the wheather condition
// Suggest activity according to user input

import java.util.Scanner;

public class ActivitySuggestorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperature;
        String activity;

        System.out.println("What is the temperature outside? : ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("Going mountains and skiing would be awesome!");
        } else if( temperature <= 15) {
            System.out.println("Watch movie with friends in cinema.");
        } else if( temperature <= 29) {
            System.out.println("Grab some köfte and go picnic.");
        } else {
            System.out.println("Go swimming and get 1st degree burns :))");
        }
    }
}
