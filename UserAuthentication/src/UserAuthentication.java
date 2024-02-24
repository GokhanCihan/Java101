
import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usernameInput, passwordInput, password, username;

        System.out.print("Create a username: ");
        usernameInput = scanner.nextLine();

        System.out.print("Crete a password: ");
        passwordInput = scanner.nextLine();

        username = usernameInput;
        password = passwordInput;

        System.out.println("Your username and password saved.");
        System.out.println("Log in again and verify your password");

        System.out.print("username: ");
        usernameInput = scanner.nextLine();
        System.out.print("password: ");
        passwordInput = scanner.nextLine();

        if (username.equals(usernameInput) && password.equals(passwordInput)) {
            System.out.println("Login successful.");
        }else {
            System.out.println("Try again.");
        }
    }
}
