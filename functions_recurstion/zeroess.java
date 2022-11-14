package functions_recurstion;
import java.util.Scanner;
public class zeroess {
    public static int zeroCount(int num)
{
    if(num == 0)
       return 0;

    if(num %10 ==0)
        return 1 + zeroCount(num / 10);
    else
        return zeroCount(num/10); 
}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = input.nextInt();
    int hell = zeroCount(num);
    System.out.println("Number of zeroes:" + hell);
    input.close();
    }
}
