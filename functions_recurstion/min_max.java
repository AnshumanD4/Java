package functions_recurstion;
import java.util.Scanner;
public class min_max {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int fnum = input.nextInt();
        int snum = input.nextInt();
        result(fnum,snum);
        input.close();
    }
    static void result(int a, int b){
        if(a > b){
            System.out.println(a + "is greater");
        }
        else
        System.out.println(b + " is greater");
    }

}