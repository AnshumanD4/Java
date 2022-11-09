package java_Day2;
import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        for (int i = 1 ; i <= 10; i++){
            System.out.printf( "%d * %d = %d\n", num,i, num * i);
        }
        input.close();
    }
}
