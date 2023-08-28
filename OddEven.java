
import java.io.*;

public class OddEven {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            FileWriter evenWriter = new FileWriter("even_numbers.txt");
            FileWriter oddWriter = new FileWriter("odd_numbers.txt");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number % 2 == 0) {
                    evenWriter.write(number + "\n");
                } else {
                    oddWriter.write(number + "\n");
                }
            }
            bufferedReader.close();
            evenWriter.close();
            oddWriter.close();

            System.out.println("Even and odd numbers separated and copied successfully.");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

