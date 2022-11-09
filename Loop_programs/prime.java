package Loop_programs;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int fnum = input.nextInt();
    boolean isprime = true;
    int iter = 0;
    if (fnum % 2 == 0 || fnum % 3 == 0)
    isprime = false;
    for (int i = 5 ; i * i < fnum ; i+=6){
        iter++;
        System.out.println("I is " + i);
        if(fnum % i == 0 || fnum % (i+2) == 0){
            isprime = false;
            break;
        }
    }
    System.out.println(iter);
    if(!isprime)
    System.out.println(fnum + " Not Prime");
    else
    System.out.println(fnum + " Prime");
    input.close();
    }
}
