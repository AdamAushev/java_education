package lr3;
import java.util.Scanner;
public class Example6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввидите число:");
        int b = in.nextInt(), c = 0, d = 0;
        for (int a = 1; a <= b; ++c) {
            if (c % 5 == 2 || c % 3 == 1) {
                if (a == b) System.out.print(c);
                else {
                    System.out.print(c + " + ");

                }
                d += c;
                ++a;
            }
        }
        System.out.print(" = " + d);
        in.close();
    }
}