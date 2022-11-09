package Loop_programs;
import java.util.Scanner;
public class hollow {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter line");
    int num = input.nextInt();
    for(int i = 0; i < num ; i++){
        for(int j = 0 ; j < num ; j++){
            if(i == 0 || j == 0 || i == num - 1 || j == num - 1 || i == j || (i+j) == num-1 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    input.close();
    }
}
