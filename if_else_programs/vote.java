package if_else_programs;
import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age > 18){
            System.out.println("you are eligible to vote");
        }
        else
            System.out.println("You are not eligible to vote.....");
    
    scanner.close();
    }
}
