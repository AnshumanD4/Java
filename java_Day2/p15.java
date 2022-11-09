package java_Day2;
import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        int a=0,b=1;
        int fib = 0;
        for (int i = 0 ; i <= num ; i++){
            System.out.println(a);
            fib = a+b;
            a = b;
            b = fib;
        }
        input.close();
    }
}
