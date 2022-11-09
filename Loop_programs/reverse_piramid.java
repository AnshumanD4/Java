package Loop_programs;
import java.util.Scanner;

public class reverse_piramid {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number");
    int num = input.nextInt();
    for(int i = 0; i < num; i++){
        for (int j = 0; j < i+1 ; j++){
            System.out.print(" ");
        }
        for (int j = 0; j < num - i ; j++){
            System.out.print("*");
        }

        for (int j = 0; j < num - i -1 ; j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    input.close();
    }
}

