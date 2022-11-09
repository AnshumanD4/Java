package functions_recurstion;
import java.util.Scanner;
public class armstrong {
    static int digit(int n){
        int count = 0;
        while(n != 0){
            n = n/10;
            count++;
            digit(n);
        }
        return count;
    }
    static void checkarm(int n){
        if(n==0 || n == 1){
            return;
        }
        else{
        int count = digit(n);
        int arm = 0;
        int rem = n%10;
        arm += Math.pow(rem,count);
        n /= 10;
        // checkarm(n);
        System.out.println( n + " is Armstrong");
        }
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number");
    int num = input.nextInt();
    checkarm(num);
    input.close();
    }
}
