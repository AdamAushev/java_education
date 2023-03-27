package lr8;
import java.io.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Запрашиваем путь до файла у пользователя
            System.out.println("Введите путь до файла: ");
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            String filePath = inputReader.readLine();

            // Читаем данные из файла
            reader = new BufferedReader(new FileReader(filePath));
            String line1 = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();

            // Парсим числа и проверяем их на положительность
            String[] doubles = line3.split(" ");
            StringBuilder positiveDoubles = new StringBuilder();
            for (String s : doubles) {
                double d = Double.parseDouble(s);
                if (d > 0) {
                    positiveDoubles.append(d).append(" ");
                }
            }

            // Перезаписываем данные в файл
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(line1);
            writer.newLine();
            writer.write("new line");
            writer.newLine();
            writer.write(positiveDoubles.toString().trim());
            writer.newLine();

            System.out.println("Файл успешно перезаписан!");

        } catch (IOException e) {
            System.err.println("Ошибка при чтении/записи файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка при парсинге числа: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файла: " + e.getMessage());
            }
        }
    }
}
