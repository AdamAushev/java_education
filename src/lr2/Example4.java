package lr2;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
             System.out.println("ВВедите число:");
        try (Scanner input = new Scanner(System.in)) {
            int x;
            x = input.nextInt();
            if (x % 4 == 0 &x>10){
                System.out.println("Делится на 4");
            } else {
                System.out.println("Не делится на 4 или меньше 10");}
        }

    }

}
