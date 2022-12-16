package lr3;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите число: ");
        int x = in.nextInt();
            int i = 0;
            int a = 1;
            int b = 1;
        System.out.print(a + " " + b);
            int sum = 0;
            for (i = 0; i < x-2; i++) {
                sum = a + b;
                a = b;
                b = sum;
                System.out.print(" " + sum );
            }
        }
    }
