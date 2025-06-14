import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "D:\\new_students.csv";
        
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student data (format: NIM,NAMA,UMUR,PRODI)");
        System.out.println("Enter 'exit' to finish");
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            String input;
            while (true) {
                System.out.print("Enter student data: ");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                bw.write(input);
                bw.newLine();
            }
            System.out.println("Data written to " + csvFile);
        } catch (IOException e) {
        } finally {
            scanner.close();
        }
    }
}