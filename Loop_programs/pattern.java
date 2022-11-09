package Loop_programs;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of line: ");
    int num = input.nextInt();
    for(int i = num ; i > 0; i--)
    {
        for(int j = num; j > i-1 ; --j ){
            System.out.print(j);
        }
        System.out.println();

    }
    input.close();
    }
}
