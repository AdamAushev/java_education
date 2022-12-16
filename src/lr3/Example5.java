package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner input = new Scanner(System.in);
        System.out.println("ВВедите первое число");
        n = input.nextInt();
        System.out.println("ВВедите второе число");
        m = input.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}
