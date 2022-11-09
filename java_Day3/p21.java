package java_Day3;

import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        boolean flag = false;
        for( int i = 2 ; i < num/2 ; i++){
            if( num/i== 0 ){
                flag = true;
                break;
            }
        }
        if (!flag)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
        input.close();
    }
}
