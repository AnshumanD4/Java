package functions_recurstion;
import java.util.Scanner;
public class odd_even_all {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        oddeven(start,end);
        input.close();
    }
    public static void oddeven(int start, int end){
            if(start>end){
                return;}
            else{
            System.out.println(start);
            }
        oddeven(start+2, end);

    }
    }