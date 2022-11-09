package java_Day2;
import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lower number: ");
        int fnum = input.nextInt();
        System.out.println("Enter upper number: ");
        int snum = input.nextInt();
        int gcd = 1;
        for (int i = 1; i <= fnum && i <= snum ; i++){
            if (fnum % i == 0 && snum % i == 0)
                gcd = i;
        }
            System.out.println("GCD is " + gcd);
    
            input.close();

        }    }
