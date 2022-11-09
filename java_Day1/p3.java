package java_Day1;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        int fnum,snum,temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num: ");
        fnum = input.nextInt();
        System.out.println("Enter second num: ");
        snum = input.nextInt();

        temp = fnum;
        fnum = snum;
        snum = temp;

        System.out.println("First num :" + fnum);
        System.out.println("Second num : " + snum);
        
        input.close();
    }
}
