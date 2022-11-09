
package java_Day2;
import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int fnum = input.nextInt();
        // int count = 0;
        while (fnum != 0){
            fnum /= 10;
            // ++count;
        }
        int sum_power = 0;
        while (fnum != 0){
            int d = fnum % 10;
            sum_power += Math.pow(d, fnum);
            fnum /= 10;
        }
        if (sum_power == fnum){
            System.out.println(fnum + " ");
        }    
        input.close();
    }
}
