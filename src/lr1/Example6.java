package lr1;



import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your last name: ");
        String fname = input.next();
        System.out.print("Input your first name: ");
        String lname = input.next();
        System.out.print("See your patronymic: ");
        String patronymic = input.next();
        System.out.println();
        System.out.println("Hello \n" + fname + " " + lname + " " + patronymic);
    }
}