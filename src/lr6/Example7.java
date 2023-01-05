package lr6;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символы: ");
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        int[] result = getCharCodes(arr);
        System.out.print("Коды символов: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scanner.close();
    }

    public static int[] getCharCodes(char[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = (int) arr[i];
        }
        return result;
    }
}
