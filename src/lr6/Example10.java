package lr6;
import java.util.Arrays;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] result = minMax(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] minMax(String[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return new int[] { min, max };
    }
}