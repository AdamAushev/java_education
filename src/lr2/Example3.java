package lr2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        try (Scanner input = new Scanner(System.in)) {
            int x;
            x = input.nextInt();
            if (x % 5 == 2) {
                System.out.println("Делится с остатком 2 при делении на 5");
            } else {
                System.out.println("Не делится с остатком 2 при делении на 5");
            }
            if (x % 7 == 1) {
                System.out.println("Делится с остатком 1 при делении на 7 ");
            } else {
                System.out.println("Не делится с остатком 1 при делении на 7");
            }
        }
    }
}
