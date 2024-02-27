import java.util.Scanner;

public class RecursiveExample {

    public static void main(String[] args) {
        int number;
        number = askNumber();
        recursiveEx(number);
    }

    static void recursiveEx(int number) {
        if (number <= 0) {
            System.out.print(number + " ");
            return;
        }
        System.out.print(number + " ");
        recursiveEx(number - 5);
        System.out.print(number + " ");
    }

    static int askNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide an integer: ");
        return scanner.nextInt();
    }
}
