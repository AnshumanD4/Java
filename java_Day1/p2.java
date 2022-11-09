package java_Day1;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int fnum,snum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        fnum = input.nextInt();
        System.out.println("Enter Second number: ");
        snum = input.nextInt();

        int result = fnum * snum;

        System.out.println("Result " + result);
        input.close();
    }
}
