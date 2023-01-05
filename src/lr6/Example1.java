package lr6;
import java.util.Scanner;

class Example1 {
    static char symbol;
    static String text;

    static void setValues(char s) {
        symbol = s;
    }

    static void setValues(String s) {
        text = s;
    }

    static void setValues(char[] arr) {
        if (arr.length == 1) {
            symbol = arr[0];
        } else {
            text = new String(arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");
        char c = scanner.next().charAt(0);
        setValues(c);

        System.out.print("Введите текст: ");
        String t = scanner.next();
        setValues(t);

        char[] arr = t.toCharArray();
        setValues(arr);

        System.out.println("символ: " + symbol);
        System.out.println("текст: " + text);
        System.out.print("текстовый моссив: ");

        for (char ch : arr) {
            System.out.print(ch + " ");
        }
    }
}

