import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Provide a string to check if it is palindrome: ");
        string = scanner.nextLine();

        System.out.println(isPalindrome(string));
    }
    static boolean isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        return str.contentEquals(reverse);
    }
}
