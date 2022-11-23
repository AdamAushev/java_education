package lr1;
import java.time.YearMonth;
import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner tu = new Scanner(System.in);

        String name;
        int year = YearMonth.now().getYear();

        int yearBorn;
        System.out.println("Ваше имя:");
        name = tu.nextLine();
        System.out.println("В каком году вы родились?");
        yearBorn= tu.nextInt();
        System.out.println("Здравствуйте "+name+"!");
        System.out.println("Ваш возраст "+(year-yearBorn));
    }
 }
