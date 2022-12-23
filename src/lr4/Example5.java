package lr4;

public class Example5 {
    public static void main(String[] args) {
        int h = 6;
        int w = 3;
        char[][] array = new char[8][9];
        for (int i = -1; i < h + 1; i++) {
            if ((i == -1) || i == h) {
                System.out.print("\n");
            } else
                for (int k = 1; k <= i + 1; k++) {
                    System.out.print("*");
                }
            System.out.print("\n");
        }
    }
}
