package lr5;
import java.util.Scanner;

public class Example4 {
        private char symbolField;
        private int intField;

        public Example4(int intField, char symbolField) {
            this.intField = intField;
            this.symbolField = symbolField;
        }

        public Example4(double d) {
            this.intField = (int)(d * 100) % 100;
            this.symbolField = (char)(int)(d);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение типа double:");
        double d = scanner.nextDouble();

        Example4 test1 = new Example4(d);
        System.out.println("Символьное поле: " + test1.symbolField);
        System.out.println("Целочисленное поле: " + test1.intField);

        System.out.println("Введите значение типа int:");
        int i = scanner.nextInt();
        System.out.println("Введите значение типа char:");
        char c = scanner.next().charAt(0);

        Example4 test2 = new Example4(i, c);
        System.out.println("Символьное поле: " + test2.symbolField);
        System.out.println("Целочисленное поле: " + test2.intField);
    }
}
