package java_Day2;
import java.util.Scanner;
public class p13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        long fac = 1;
        for (int i = 1 ; i <= num ; i++) {
        fac = fac * i;
    }    
        System.out.println(fac);
    
    input.close();
}}
