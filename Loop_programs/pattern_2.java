package Loop_programs;
import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter line : ");
    int line = input.nextInt();
    int count = 0;
    for(int i = 0; i < line; i++){
        for(int j = 0 ; j < i+1 ; j++){
            count++;
            System.out.print(" " +count);
        }
        System.out.println();
    }
    input.close();
    }
}
