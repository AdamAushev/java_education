package lr5;
import java.util.Scanner;
    class TestClass {
        private int intField;

        public void setIntField(int intField) {
            if (intField > 100) {
                this.intField = 100;
            } else {
                this.intField = intField;
            }
        }

        public TestClass() {
            this.intField = 0;
        }

        public TestClass(int intField) {
            setIntField(intField);
        }

        public int getIntField() {
            return intField;
        }
    }

    public class Example5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            TestClass test1 = new TestClass();
            System.out.println("Значение поля: " + test1.getIntField());


            System.out.println("Введите целое число:");
            int i = scanner.nextInt();
            TestClass test2 = new TestClass(i);
            System.out.println("Значение поля: " + test2.getIntField());


            test2.setIntField(200);
            System.out.println("Значение поля: " + test2.getIntField());
        }
    }
