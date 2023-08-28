import java.io.*;
import java.util.Scanner;

public class WrtRead {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter lines of text (type 'done' on a separate line to finish):");
            String inputLine;
            while (!(inputLine = scanner.nextLine()).equalsIgnoreCase("done")) {
                writer.write(inputLine + "\n");
            }
            writer.close();
            System.out.println("Data written to the file successfully.");

            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Contents of the file:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
