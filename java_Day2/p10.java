package java_Day2;
import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int fnum = input.nextInt();
        System.out.println("Enter Second number: ");
        int snum = input.nextInt();

        int temp = 0;
        temp = fnum;
        fnum = snum;
        snum = temp;

        System.out.println("First Number: " + fnum);
        System.out.println("Second Number: " + snum);

    input.close();
    }
}
