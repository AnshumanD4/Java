package switch_case;
import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("for Addition : 1 ");
    System.out.println("For Sub: 2");
    System.out.println("For div: 3");
    System.out.print("Enter Choice: ");
    int choice = input.nextInt();
    System.out.println("Enter first Number: ");
    int fnum = input.nextInt();
    
    System.out.println("Enter second Number: ");
    int snum = input.nextInt();
    
    int result = 0;
    switch (choice){
        case 1:{
            result = fnum + snum;
            System.out.println("Result: " + result);

            break;
        }
        case 2:{
            result = fnum - snum;
            System.out.println("Result: " + result);

            break;
        }
        case 3:{
            result = fnum * snum;
            System.out.println("Result: " + result);

            break;
        }
        default: {
            System.out.println("Result: " + result);
        }
    }

    input.close();
    }
}
