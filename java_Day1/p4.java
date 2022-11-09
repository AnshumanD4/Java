package java_Day1;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if ((num | 1) > num)
        System.out.println("Number is even.......");
        else
        System.out.println("Number is odd........");
        input.close();
    }
}
