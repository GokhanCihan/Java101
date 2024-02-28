public class HarmonicAverage {

    public static void main(String[] args) {
        int[] numbers = {4, 8, 16, 21};

        System.out.println(harmonicAverage(numbers));
    }

    static double harmonicAverage(int[] array) {
        double seriesSum = 0;
        for (double element: array) {
            seriesSum += 1 / element;
        }
        return array.length / seriesSum;
    }
}
