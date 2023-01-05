package lr6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Example3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Введите числа через пробел (Введите 'q' конце):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        int min = min(numbers);
        int max = max(numbers);
        double avg = avg(numbers);

        System.out.println("Мин: " + min);
        System.out.println("Макс: " + max);
        System.out.println("Среднее: " + avg);
    }

    public static int min(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            min = Math.min(min, n);
        }
        return min;
    }

    public static int max(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            max = Math.max(max, n);
        }
        return max;
    }

    public static double avg(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.size();
    }
}
