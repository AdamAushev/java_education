package lr8;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FilesDate {
    public static void main(String[] args) {
        try {
            File f1 = new File("F:\\Bardak\\My\\numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");

            // Мы хотим использовать FileOutputStream для записи данных в файл
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1));

            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");
            for (int i = 0; i < count; i++)
                wr.writeFloat(sc.nextFloat());
            wr.flush();
            wr.close();

            File f2 = new File("F:\\Bardak\\My\\numRez.txt");
            f2.createNewFile();

            // Мы хотим использовать FileInputStream для чтения данных из файла
            DataInputStream rd = new DataInputStream(new FileInputStream(f1));
            wr = new DataOutputStream(new FileOutputStream(f2));

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Число: " + number);
                }
            } catch (EOFException e) {
                System.out.println("End of file");
            }
            wr.flush();
            wr.close();
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

