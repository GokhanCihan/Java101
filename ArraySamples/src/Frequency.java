import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] list = {4, 9, 1, 9, 0, 3, -1, 2, 1, 11, -3, 1, 1, 17, 17, 9, 3, 9};
        int frequency;
        int keyIndex;
        int maxValue;
        Arrays.sort(list);

        // remove elements with max value and get the count

        while (list.length > 1) {
            // index of max value
            maxValue = list[list.length - 1];

            // find first appearance of the max value in sorted array
            keyIndex = Arrays.binarySearch(list, maxValue);

            frequency = list.length - keyIndex;

            // repeated elements with max value remove
            list = Arrays.copyOfRange(list, 0, (keyIndex - 1));

            if(frequency>1){
            System.out.print(maxValue + " found " + frequency + " times");
            System.out.println();
            }
        }
    }
}
