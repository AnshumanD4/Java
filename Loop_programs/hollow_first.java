package Loop_programs;
import java.util.Scanner;
public class hollow_first {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter line");
    int num = input.nextInt();
    for(int i = 0; i < num ; i++){
        for(int j = 0 ; j < num ; j++){
            if(i == 0 || j == 0 || i == num - 1 || j == num - 1 ||i == num/2 && j == num/2 ){
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
