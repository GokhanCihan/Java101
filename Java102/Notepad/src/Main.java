import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        System.out.println("\nsave and quit: \\q");
        System.out.println("-----------------------NOTES------------------------");
        readFile();
        writeFile();
        scanner.close();
    }

    public static void writeFile() {
        String line;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            while(true){
                System.out.print("> ");
                if(!Objects.equals(line = scanner.nextLine(), "\\q")) {
                    writer.write(line + "\n");
                }else {
                    writer.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
