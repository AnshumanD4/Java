package java_Day2;

import java.util.Scanner;

public class j8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " Year is Leap");
        }
        else
            System.out.println(" Year is not Leap");
        input.close();
    }
}
