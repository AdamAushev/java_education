package lr1;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String day = in.nextLine();

        System.out.println("Месяц: ");
        String muth = in.nextLine();

        System.out.println("Число: ");
        int num = in.nextInt();

        System.out.println("День недели: " + day );
        System.out.println("Число: " + num );
        System.out.println("Месяц: " + muth );
        in.close();
    }
}