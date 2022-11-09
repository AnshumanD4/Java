package java_Day1;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        int fnum,snum,tnum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        fnum = input.nextInt();
        System.out.println("Enter Second Number: ");
        snum = input.nextInt();
        System.out.println("Enter Third Number: ");
        tnum = input.nextInt();

        int large = tnum > (fnum>snum ? fnum:snum) ? tnum:((fnum > snum) ? fnum : snum);
        System.out.println(large + " is the greatest");
        input.close();
    }
}
