package Loop_programs;
import java.util.Scanner;

public class three_line_loop {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number");
    int num = input.nextInt();
    for(int i = 0; i < num; i++){
        for (int j = 0; j < num - i ; j++){
            System.out.print(" ");
        }
        for(int k = 0 ; k <  i + 1; k++){
            System.out.print("*");
        }
        for(int x = 0 ; x < i; x++){
            System.out.print("*");
        }
        System.out.println();
    }
    input.close();
    }
}
