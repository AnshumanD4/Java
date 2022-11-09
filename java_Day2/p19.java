package java_Day2;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();
        int reverse = 0;
        System.out.println("before reverse Number: " + number);
        while (number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reverse);
        input.close();

    }
}
