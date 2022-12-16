package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите день недели: ");
        String dayName = in.nextLine();
        int day;

            switch (dayName) {
                case "Понедельник":
                    day = 1;
                    break;
                case "Вторник":
                    day = 2;
                    break;
                case "Среда":
                    day = 3;
                    break;
                case "Четверг":
                    day = 4;
                    break;
                case "Пятница":
                    day = 5;
                    break;
                case "Суббота":
                    day = 6;
                    break;
                case "Воскресенье":
                    day = 7;
                    break;
                default:
                    day = 0;
                    break;
            }
        {System.out.println(day);
            if (day == 0) {
                System.out.println("Такого дня нет");}

        }
    }
}

