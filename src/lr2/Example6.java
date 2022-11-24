package lr2;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        System.out.println("ВВедите число:");
        try (Scanner input = new Scanner(System.in)) {
            int x ;
            x = input.nextInt();
            int y;
            y = (x/1000);
            System.out.println("Ответ:" +y);
        }


    }
}
