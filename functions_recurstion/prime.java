package functions_recurstion;
import java.util.Scanner;

public class prime {
    public static boolean checkprime(int a,int i){
        if(a<i){
            return checkprime(a, i+1);
        }
        if(i*i > a){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int number = input.nextInt();
    boolean ch = checkprime(number,2);
    if(ch == true){
        System.out.println("Non Prime");
    }
    else{
        System.out.println("Prime");
    }
    input.close();
}
}