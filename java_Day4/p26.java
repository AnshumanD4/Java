package java_Day4;

import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        int result = sum(num); 
        System.out.println(result + " is sum");
        input.close();
    }    


    public static int sum(int num) {
        if(num != 0){
            return num + sum(num - 1);
        }
        else
        return num;
    }
}
