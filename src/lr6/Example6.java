package lr6;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;
        while (arr == null) {
            try {
                System.out.print("Введите элементы массива: ");
                String input = scanner.nextLine();
                String[] elements = input.split(" ");
                arr = new int[elements.length];
                for (int i = 0; i < elements.length; i++) {
                    arr[i] = Integer.parseInt(elements[i]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Введите целочисленные элементы массива, разделенные пробелами.");
            }
        }
        System.out.print("Сколько элементов нужно скопировать? ");
        int n = scanner.nextInt();
        int[] result = copyFirstElements(arr, n);
        System.out.print("Скопированный массив: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] copyFirstElements(int[] arr, int n) {
        int[] result = new int[n];
        if (n > arr.length) {
            result = arr.clone();
        } else {
            for (int i = 0; i < n; i++) {
                result[i] = arr[i];
            }
        }
        return result;
    }
}
