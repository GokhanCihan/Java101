// Find users Western horoscope using your month of birth and day of birth

import  java.util.Scanner;

public class WesternHoroscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int monthOfBirth;
        int dayOfBirth;
        String horoscope = null;

        System.out.print("Which month did you born: ");
        monthOfBirth = input.nextInt();

        System.out.print("Which day did you born: ");
        dayOfBirth = input.nextInt();

        if (monthOfBirth == 1) {
            if (dayOfBirth < 22) {
                horoscope = "Capricorn (Goat)";
            }else {
                horoscope = "Aquarius (The Water bearer). It is known as the best horoscope!";
            }
        }
        if (monthOfBirth == 2) {
            if (dayOfBirth < 20) {
                horoscope = "Aquarius (The Water bearer). It is known as the best horoscope!";
            }else {
                horoscope = "Pisces (The Fish)";
            }
        }
        if (monthOfBirth == 3) {
            if (dayOfBirth < 21) {
                horoscope = "Pisces (The Fish)";
            }else {
                horoscope = "Aries (The Ram)";
            }
        }
        if (monthOfBirth == 4) {
            if (dayOfBirth < 21) {
                horoscope = "Aries (The Ram)";
            }else {
                horoscope = "Taurus (The Bull)";
            }
        }
        if (monthOfBirth == 5) {
            if (dayOfBirth < 22) {
                horoscope = "Taurus (The Bull)";
            }else {
                horoscope = "Gemini (The Twins)";
            }
        }
        if (monthOfBirth == 6) {
            if (dayOfBirth < 23) {
                horoscope = "Gemini (The Twins)";
            }else {
                horoscope = "Cancer (The Crab";
            }
        }
        if (monthOfBirth == 7) {
            if (dayOfBirth < 23) {
                horoscope = "Cancer (The Crab";
            }else {
                horoscope = "Leo (The Lion)";
            }
        }
        if (monthOfBirth == 8) {
            if (dayOfBirth < 23) {
                horoscope = "Leo (The Lion)";
            }else {
                horoscope = "Virgo (The Maiden)";
            }
        }
        if (monthOfBirth == 9) {
            if (dayOfBirth < 23) {
                horoscope = "Virgo (The Maiden)";
            }else {
                horoscope = "Libra (The Scales)";
            }
        }
        if (monthOfBirth == 10) {
            if (dayOfBirth < 23) {
                horoscope = "Libra (The Scales)";
            }else {
                horoscope = "Scorpio (The Scorpion)";
            }
        }
        if (monthOfBirth == 11) {
            if (dayOfBirth < 22) {
                horoscope = "Scorpio (The Scorpion)";
            }else {
                horoscope = "Sagittarius  (The Archer)";
            }
        }
        if (monthOfBirth == 12) {
            if (dayOfBirth < 22) {
                horoscope = "Sagittarius  (The Archer)";
            }else {
                horoscope = "Capricorn (The Goat)";
            }
        }
        if ((monthOfBirth < 1) || (monthOfBirth > 12)){
            horoscope = "unknown";
        }

        System.out.println("your horoscope is " + horoscope);
    }
}
