package lr5;
import java.util.Scanner;
public class Example3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ведите значение x: ");
            int x = scanner.nextInt();
            System.out.print("Ведите значение y: ");
            int y = scanner.nextInt();

            NumberHolder nh1 = new NumberHolder();
            NumberHolder nh2 = new NumberHolder(x);
            NumberHolder nh3 = new NumberHolder(x, y);
        }
    }

    class NumberHolder {
        private int x;
        private int y;

        public NumberHolder() {
            x = 0;
            y = 0;
        }
        public NumberHolder(int x) {
            this.x = x;
            y = 0;
        }

        public NumberHolder(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
