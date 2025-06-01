import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "students.csv";

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Umur: ");
            String umur = scanner.nextLine();

            System.out.print("Masukkan Prodi: ");
            String prodi = scanner.nextLine();

            String line = nim + "," + nama + "," + umur + "," + prodi;
            bw.write(line);
            bw.newLine();

            System.out.println("Data berhasil ditambahkan ke students.csv");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
