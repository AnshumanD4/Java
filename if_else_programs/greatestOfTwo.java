package if_else_programs;
import java.util.Scanner;

public class greatestOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter number 1");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Enter number 2");
        int b = scanner.nextInt();

        if ( a > b)
            System.out.println("Number " + a + " Is greater");
        else
            System.out.println("Number " + b + " Is greater");

        scanner.close();
    }
}
