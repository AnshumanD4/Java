package if_else_programs;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = a.nextInt();
        if ((num & 1) == 1)
            System.out.println("Number is Odd.....");
        else
            System.out.println("Number is Even....");
        a.close();
    }
}
