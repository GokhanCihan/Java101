import java.util.Arrays;

public class RepeatedElements {
    static boolean isFound(int[] arr, int value) {
        for (int element : arr) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {11, 4, 9, 9, 0, 3, -1, 2, 1, 11, -3, 1};
        int[] repeatedElements = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i == j || (list[i] == list[j])) {
                    if (!isFound(repeatedElements, list[i])) {
                        repeatedElements[startIndex++] = list[i];
                    }

                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(repeatedElements));
    }
}
