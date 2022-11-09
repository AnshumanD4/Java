package java_Day3;

import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int num = input.nextInt();
        for (int i = 2; i <= num; ++i){
            if(num % i == 0){
                System.out.println(i + " is a factor of "+ num);
            }
        }    
        input.close();
    }
    
}
