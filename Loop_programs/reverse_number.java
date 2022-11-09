package Loop_programs;
import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = input.nextInt();
    int reverse = 0 ;

        while(num != 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num/=10;
        }
        System.out.println("reverse: "+ reverse);
    input.close();
    }
}
