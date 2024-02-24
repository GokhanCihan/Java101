import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String username, password;
        Scanner scanner = new Scanner(System.in);
        int remainingTrials = 3;
        int balance = 1500;
        int selection;
        while (remainingTrials > 0) {
            System.out.print("username: ");
            username = scanner.nextLine();

            System.out.print("password: ");
            password = scanner.nextLine();
            if (username.equals("gökhan") && password.equals("dev123")) {
                System.out.println("Welcome!");
                do {
                    System.out.println("""
                            1-Cash In
                            2-Cash Out
                            3-Check Balance
                            4-Log Out""");
                    System.out.print("Please make a selection: ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Amount of cash in: ");
                            int amount = scanner.nextInt();
                            balance += amount;
                            break;

                        case 2:
                            System.out.print("Amount of cash out: ");
                            int price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            System.out.println("Balance: " + balance);
                            break;

                        case 4:
                            System.out.println("Goodbye");
                            break;
                    }
                }while (selection != 4);
            } else {
                remainingTrials--;
                System.out.println("Wrong username or password. Please try again.");
                if (remainingTrials == 0) {
                    System.out.println("Your accout is blocked. Please contact with our personnel");
                } else {
                    System.out.println("Remaining trials : " + remainingTrials);
                }
            }
        }
    }
}