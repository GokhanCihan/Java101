import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        int[] list;

        System.out.print("Provide an integer for the length of the array: ");
        length = scanner.nextInt();

        list = getListElements(scanner, length);

        Arrays.sort(list);
        printList(list);

    }

    static int[] getListElements(Scanner scanner, int length) {
        int[] list = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Provide array's " + (i + 1) + ". element: ");
            list[i] = scanner.nextInt();
        }
        return list;
    }

    static void printList(int[] list){
        System.out.println("========================================");
        System.out.println("The sequence of the array after sorting:");
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + ". element: " + list[i]);
        }
    }
}
