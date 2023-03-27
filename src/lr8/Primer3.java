package lr8;
import java.io.*;
import java.util.Scanner;
public class Primer3 {
    public class FilesData {
        public static void main(String[] args) {
            try {
                // 1. Создание новой папки My на диске
                File folder = new File("My");
                folder.mkdir();

                // 2. В папке создать 1-й файл numIsh.txt
                File numIsh = new File(folder.getAbsolutePath() + File.separator + "numIsh.txt");
                numIsh.createNewFile();

                // 3. Запись в файл numIsh.txt вещественных чисел, вводимых с клавиатуры
                Scanner sc = new Scanner(System.in, "cp1251");
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(numIsh.getAbsolutePath()));
                System.out.println("Сколько вещественных чисел записать в файл?");
                int count = sc.nextInt();
                System.out.println("Введите числа:");
                for (int i = 0; i < count; i++) {
                    dos.writeFloat(sc.nextFloat());
                }
                dos.close();

                // 4. В той же папке создать 2-й файл numRez.txt
                File numRez = new File(folder.getAbsolutePath() + File.separator + "numRez.txt");
                numRez.createNewFile();

                // 5. Последовательно считывая числа из 1-го файла numIsh.txt, переписать их во 2-й файл numRez.txt
                DataInputStream dis = new DataInputStream(new FileInputStream(numIsh.getAbsolutePath()));
                dos = new DataOutputStream(new FileOutputStream(numRez.getAbsolutePath()));
                try {
                    while (true) {
                        float number = dis.readFloat(); // считывание числа из 1-го файла
                        dos.writeFloat(number); // запись числа во 2-й файл
                        System.out.println("Число " + number + " записано в файл numRez.txt");
                    }
                } catch (EOFException e) {
                    // достигнут конец файла
                }
                dis.close();
                dos.close();

                // 6. Завершение программы
                System.out.println("Программа завершена успешно");

            } catch (IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
