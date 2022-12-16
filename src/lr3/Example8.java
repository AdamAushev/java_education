package lr3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Example8 {
    public static void main(String[] args) {
        Scanner id = new Scanner(in);
        int n;
        System.out.println("Введите размер массива");
        n = id.nextInt();
        char[] charArray = new char[n];
        char b = 'a';

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = b;
            b += 2;
            System.out.print(charArray[i] + "\t");
        }

        System.out.println();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + "\t");
        }
    }
}

