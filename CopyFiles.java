import java.io.*;

public class CopyFiles {
    public static void main(String[] args) {
        try {
            File sourceFile = new File("source.txt");
            File destinationFile = new File("destination.txt");

            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destinationFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line + "\n");
            }

            bufferedReader.close();
            writer.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

