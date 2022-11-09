package java_Day4;

import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the 1 number");
    int fnum = input.nextInt();
    System.out.print("Enter the 2 number");
    int snum = input.nextInt();

    int GCD = findGCD( fnum,  snum);
    System.out.println("the GCD is: " + GCD);
    input.close();
    }

    public static int findGCD(int fnum, int snum) {
       if( snum != 0){
            return findGCD(snum, fnum%snum);
       }
       else
            return fnum;
        }
}
