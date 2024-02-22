// Find users Chinese horoscope using year of birth

import  java.util.Scanner;

public class ChineseHoroscopeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yearOfBirth;
        String horoscope;

        System.out.print("Your of birth: ");
        yearOfBirth = input.nextInt();

        horoscope = switch (yearOfBirth % 12) {
            case 0 -> "Monkey";
            case 1 -> "Roaster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Rat";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Sheep";
            default -> "Unknown";
        };

        System.out.println("Chinese horoscope for year " + yearOfBirth + ": " + horoscope);
    }
}