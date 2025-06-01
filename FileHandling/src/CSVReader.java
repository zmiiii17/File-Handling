import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "students.csv";
        String line;
        String splitBy = ",";
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            boolean isHeader = true;
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] data = line.split(splitBy);
                System.out.println("NIM: " + data[0] + ", Nama: " + data[1] +
                                   ", Umur: " + data[2] + ", Prodi: " + data[3]);
                rowCount++;
            }
            System.out.println("Jumlah baris data (tanpa header): " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
