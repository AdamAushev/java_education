package lr4;
import java.util.Random;
public class Example6 {
        public static void main(String[] args) {
            Random r = new Random();

            int k = 7;
            int m = 5;

            int[][] arr = new int[k][m];

            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = r.nextInt(100) + 1;
                }
            }

            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("*********************************");

            int a = m;
            int b = k;

            int[][] arrLast = new int[a][b];

            for (int i = 0; i < arrLast.length; i++){
                for (int j = 0; j < arrLast[i].length; j++){
                    arrLast[i][j] = arr[j][i];
                }
                System.out.println();
            }

            for (int i = 0; i < arrLast.length; i++){
                for (int j = 0; j < arrLast[i].length; j++){
                    System.out.print(arrLast[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }