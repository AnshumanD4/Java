package functions_recurstion;
import java.util.Scanner;

public class all_nat{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start = input.nextInt();
        System.out.println("Enter the last number: ");
        int end = input.nextInt();
        natural(start,end);
        input.close();
    }
    public static void natural(int start,int end){
        if(start<end){
            System.out.print(start +  ",");
            ++start;
            natural(start,end);
        }
    }
}