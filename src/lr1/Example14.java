package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {


        int num;

        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("ВВедите число");
        num = input.nextInt();

        Scanner op = new Scanner (System.in);

        System.out.println("Ваш ответ "+(num - 1) +num +(num+1) +(((num - 1) +num +(num+1))*((num - 1) +num +(num+1))));
    }

}
