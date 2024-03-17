import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide an integer between 0 and 9 " +
                "to find out value of the array element at that position: ");

        // catches the exception threw either inside the function or in scanner input
        try {
            int index = scanner.nextInt();
            System.out.println(findElement(index));
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static String findElement(int index) throws ArrayIndexOutOfBoundsException {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        if(index < 0 || index > 9){
            throw new ArrayIndexOutOfBoundsException("value of the index should be between 0 and 9 (inclusive)");
        }
        return arr[index];
    }
}
