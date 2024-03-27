import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String fileName = "integer.txt";

        writeNumbersToFile(fileName, 5, 10, 20, 12, 33);
        printSum(readNumbersFromFile(fileName));
    }

    public static void writeNumbersToFile(String fileName, int... numbers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int number : numbers) {
                writer.write(number + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Integer> readNumbersFromFile(String fileName) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (true) {
                String inputLine = reader.readLine();
                if (inputLine == null) break;
                numbers.add(Integer.valueOf(inputLine));

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return numbers;
    }

    public static void printSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
