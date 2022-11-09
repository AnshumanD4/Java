package java_Day4;

import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        long result =  fac(num);
        System.out.println( "Factorial is " + result );
        input.close();
    }
    public static long fac(int num){
        if(num > 0){
            return(num * fac(num - 1));
        }
        else
            return 1;
    }
}
