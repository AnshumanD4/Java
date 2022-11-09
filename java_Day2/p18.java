package java_Day2;
import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int count = 0;
        while (number > 0){
            number/= 10;
            count += 1;
        }
        System.out.println("Total Digit: " + count);
        input.close();
    }
}
