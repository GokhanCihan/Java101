import java.util.Arrays;
import java.util.Scanner;

public class ClosestElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int[] newList = new int[list.length + 1];
        int number;

        System.out.print("Provide a number to find closest elements in the list: ");
        number = scanner.nextInt();

        // copy elements in list to new list
        for (int i = 0; i < list.length ; i++) {
            newList[i] = list[i];
        }

        // add number at the end and sort elements
        newList[list.length-1] = number;
        Arrays.sort(newList);
        System.out.println(Arrays.toString(newList));

        // find index of added number
        int index = Arrays.binarySearch(newList, number);
        int lower = closestLower(newList, index);
        int greater = closestGreater(newList, index);

        System.out.println(lower != number ? "closest lower value: " + lower : "no lower value");
        System.out.println(greater != number ? "closest greater value: " + greater : "no greater value");
    }

    // if a lower value exists in the list
    static int closestLower(int[] arr, int index){
        if (index - 1 < arr.length){
            if (arr[index] == arr[index - 1]){
                return closestLower(arr, index - 1);
            }else {
                return arr[index - 1];
            }
        }else {
                return arr[index];
        }
    }

    // if a greater value exists in the list
    static int closestGreater(int[] arr, int index){
        if (index + 1 < arr.length){
            if (arr[index] == arr[index + 1]){
                return closestLower(arr, index + 1);
            }else {
                return  arr[index + 1];
            }
        }else {
            return arr[index];
        }
    }
}
