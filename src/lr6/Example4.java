package lr6;
import java.util.Scanner;
public class Example4 {

    public static int doubleFactorial(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * doubleFactorial(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления двойного факториала: ");
        int n = scanner.nextInt();
        int result = doubleFactorial(n);
        System.out.println("Двойной факториал числа " + n + " равен " + result);
    }
}