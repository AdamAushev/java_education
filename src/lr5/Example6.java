package lr5;
import java.util.Scanner;
    class TestClass2 {
        private int max;
        private int min;

        public void setFields(int x, int y) {
            if (x > y) {
                max = x;
                min = y;
            } else {
                max = y;
                min = x;
            }
        }

        public TestClass2(int x, int y) {
            setFields(x, y);
        }

        public TestClass2(int x) {
            setFields(x, 0);
        }

        public void displayFields() {
            System.out.println("max: " + max);
            System.out.println("min: " + min);
        }
    }

    public class Example6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите два целых числа:");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            TestClass2 test1 = new TestClass2(x, y);
            test1.displayFields();

            System.out.println("Введите целое число:");
            x = scanner.nextInt();
            TestClass2 test2 = new TestClass2(x);
            test2.displayFields();
        }
    }
