package java_Day3;

import java.util.Scanner;

public class p23 {
    public static boolean checkprimenum(int num) {
        boolean flag = true;
        for(int i = 2 ; i <= num/2; ++i){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter low number:");
        int lownum = input.nextInt();
        System.out.println("Enter high number:");
        int highnum = input.nextInt();
        input.close();

        while( lownum < highnum){
            if(checkprimenum(lownum))
                System.out.println( lownum + " ");
            ++lownum;
        }

        }

}
