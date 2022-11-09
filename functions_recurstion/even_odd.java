package functions_recurstion;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int fnum = input.nextInt();
        even(fnum);
        input.close();
    }
    static void even(int a){
        if(a%2 == 0){
            System.out.printf("Number % d is even...",a);
        }
        else{
            System.out.println("Odd");
        }
    }
}
