package lr5;
import java.util.Scanner;

public class Example1 {
        public static void main(String[] args) {
            Symbol symbol = new Symbol();
            symbol.setSymbol();
            symbol.printSymbolInfo();
        }
    }
    class Symbol {
        private char symbol;

        public void setSymbol() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ведите символ: ");
            symbol = scanner.next().charAt(0);
        }

        public int getSymbolCode() {
            return (int) symbol;
        }

        public void printSymbolInfo() {
            System.out.println("Symbol: " + symbol + ", Code: " + getSymbolCode());
        }
    }
