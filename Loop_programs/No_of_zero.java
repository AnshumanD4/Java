package Loop_programs;
import java.util.Scanner;
public class No_of_zero {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = input.nextInt();
    int count = 0;
    while(num != 0){
        int lastdigit = num % 10;
        if(lastdigit == 0){
            count++;
        }
        num /= 10;
    }
    System.out.print("Count: " + count);
    input.close();
    }
}
