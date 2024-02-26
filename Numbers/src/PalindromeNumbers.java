// ask user a number to find if it is a palindrome number

import java.util.Scanner;

public class PalindromeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Provide an integer: ");
        number = scanner.nextInt();

        if (isPalindrome(number)){
            System.out.println(number + " is a palindrome number");
        }else {
            System.out.println(number + " is not a palindrome number");
        }
    }
    
    static boolean isPalindrome(int number) {
        return number == reversedNumber(number);
    }

    static int reversedNumber(int number) {
        int tempNumber = number, reversed = 0;

        while (tempNumber != 0){
            reversed = reversed * 10 + tempNumber % 10;
            tempNumber = tempNumber / 10;
        };
        return reversed;
    }
}
