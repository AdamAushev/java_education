package lr5;
import java.util.Scanner;
public class Example2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ведите начальный символ: ");
            char start = scanner.next().charAt(0);
            System.out.print("Ведите конечнный символ: ");
            char end = scanner.next().charAt(0);

            SymbolRange symbolRange = new SymbolRange(start, end);
            symbolRange.printSymbolsInRange();
        }
    }

    class SymbolRange {
        private char start;
        private char end;

        public SymbolRange(char start, char end) {
            this.start = start;
            this.end = end;
        }

        public void printSymbolsInRange() {
            for (char c = start; c <= end; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
