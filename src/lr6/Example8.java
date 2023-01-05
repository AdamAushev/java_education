package lr6;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива (нажмите Enter после каждого элемента, а после последнего - нажмите Enter и введите 0):");
        int size = 0;
        int[] arr = new int[size];
        int num;
        do {
            num = scanner.nextInt();
            if (num != 0) {
                arr = addElement(arr, num);
                size++;
            }
        } while (num != 0);
        double average = getAverage(arr);
        System.out.println("Среднее значение: " + average);
        scanner.close();
    }

    public static int[] addElement(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = num;
        return newArr;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
