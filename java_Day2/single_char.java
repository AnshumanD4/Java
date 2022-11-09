package java_Day2;

import java.util.Scanner;

public class single_char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        int number = (int) ch;
        System.out.println(number);        
        input.close();
    }
}
