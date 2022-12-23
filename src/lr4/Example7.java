package lr4;
import java.util.Random;
public class Example7 {

        public static void main(String[] args) {
            Random r = new Random();

            int k = 4;
            int m = 3;

            int[][] fullArray = new int[k][m];


            for (int i = 0; i < fullArray.length; i++){
                for (int j = 0; j < fullArray[i].length; j++){
                    fullArray[i][j] = r.nextInt(10) + 1;
                }
            }


            for (int i = 0; i < fullArray.length; i++){
                for (int j = 0; j < fullArray[i].length; j++){
                    System.out.print(fullArray[i][j] + "\t");
                }
                System.out.println();
            }


            int[][] newArray = new int[fullArray.length][];
            for (int i = 0; i < fullArray.length; i++){
                int[] aFullArray = fullArray[i];
                int aLength = aFullArray.length;
                newArray[i] = new int[aLength];
                System.arraycopy(aFullArray, 0, newArray[i], 0, aLength);
            }

            int a = r.nextInt(k);
            int b = r.nextInt(m);

            System.out.println("**********************");



            for (int i = 0; i < newArray.length; i++){
                for (int j = 0; j < newArray[i].length; j++){
                    System.out.print(newArray[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Удален из строк: " + a);
            System.out.println("Удален из столб: " + b);

            System.out.println("****************");

            for (int i = 0; i < newArray.length; i++){
                for (int j = 0; j < newArray[i].length; j++){
                    if(i == a){
                        if (i != k - 1)
                        {
                            i = i+1;
                        } else {
                            continue;
                        }
                        newArray[a][b] = newArray[i][j];
                    }
                    if (j == b){
                        if (j != m - 1){
                            j = j + 1;
                        } else {
                            continue;
                        }
                        newArray[a][b] = newArray[i][j];
                    }
                    System.out.print(newArray[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
