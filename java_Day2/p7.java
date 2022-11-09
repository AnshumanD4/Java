package java_Day2;
import java.util.Scanner;
public class p7 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println("Prime numbers are: ");
    for (int i = 2 ; i <= num; ++i){
        int count = 0;
            for(int j = 2 ; j * j < i ; ++j){
                if (i % j == 0){
                    count++;
                }
                }
           if (count == 0){
            System.out.print( " " + i);
           }
    }

    input.close();
}
}
