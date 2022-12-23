package lr4;
public class Example4 {
    public static void main(String[] args) {
        int h = 6;
        int w = 3;
        char[][] array = new char[8][9];
        for (int i = 0; i <= (h + 1); i++) {
            for (int j = 0; j <= (w + 1); j++) {
                if ((i == 0 || j == 0) || (i == (h + 1) || j == (w + 1))) {
                    System.out.print("2");
                    array[j][i] = '2';
                } else {
                    System.out.print("2");
                    array[j][i] = '2';
                }
            }
            System.out.print("\n");
        }

    }
}