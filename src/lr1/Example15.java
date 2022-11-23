package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("ВВедите первое число");
        num1 = input.nextInt();

        System.out.println("ВВедите второе число");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Сумма " +(num1 + num2) );
        System.out.println("Разность " +(num1 - num2));
    }

}
