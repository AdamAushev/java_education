package lr2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            int i = scan.nextInt();

            if (i % 3 == 0 ^ 3 == 0) {
                System.out.println(i + " делится на 3" );
            } else
                System.out.println(i + " Не делится на 3 ");
        }
    }
}
