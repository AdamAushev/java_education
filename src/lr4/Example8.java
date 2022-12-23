package lr4;
import static java.lang.System.out;
public class Example8 {
    public static void main(String[] args) {
        int n = 4;
        makeSnake(n);
    }

    public static void makeSnake(int n) {
        int[][] array = new int[n][n];

        int a = -1;
        int count = 1;
        for (int i = 0; i < n; i++) {
            a *= -1;
            int start = 0;
            if (i % 2 != 0) start = n - 1;
            else start = 0;
            for (int j = start; (j < n) & (j >= 0); j += a) {

                array[i][j] = count++;
            }
        }
        printMatrix(array);
    }

    public static void printMatrix(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}



