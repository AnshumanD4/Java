
package java_Day2;
import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int fnum = input.nextInt();
        if ((fnum & 1) == 1)
        System.out.println("Odd");
        else
        System.out.println("Even"); 
        if ((fnum | 1) > fnum )
        System.out.println("Even");
        else
        System.out.println("Odd");
        if ((fnum ^ 1) == fnum + 1)
        System.out.println("Even");
        else
        System.out.println("Odd");
        input.close();
        
    }
}
