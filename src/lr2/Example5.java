package lr2;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        System.out.println("ВВедите число:");
        try (Scanner input = new Scanner(System.in)) {
            int x;
            x = input.nextInt();
            if ((x >= 5) & (x <= 10)) {
                System.out.println("Есть в диапазоне от 5 до 10");
            } else {
                System.out.println("Нет в диапазоне от 5 до 10");

            }
        }


    }
}
