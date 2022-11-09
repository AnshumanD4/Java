package java_Day3;

import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num/2; ++i){
            if(checkPrime(i)){
                if(checkPrime(num-i)){
                    System.out.printf("%d = %d + %d\n", num , i , num - i);
                    flag = true;

                }
            }
        }
        if (!flag)
        System.out.println(num + " cannot be expressed as sum of prime number");
        input.close();
    }


    static boolean checkPrime(int num){
        boolean isPrime = true;
    for (int i = 2 ; i <= num/2 ; ++i){
        if (num % i == 0){
            isPrime = false;
            break;
        }
    }
    return isPrime;
    }
    
}
