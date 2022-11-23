package lr1;

import java.time.YearMonth;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner tu = new Scanner(System.in);

        String name;
        int year = YearMonth.now().getYear();

        int age;

        System.out.println("Сколько вам лет?");
        age = tu.nextInt();
        System.out.println("Вы родились " + (year - age));
    }
}
