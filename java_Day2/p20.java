package java_Day2;
import java.util.Scanner;
public class p20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base: ");
        int base = input.nextInt();
        int result = 1;
        System.out.println("Enter Indices: ");
        int Indices = input.nextInt();
        for (int i = 1; i < Indices; i++){
            result = result * base;
        }
        System.out.println("Result: " + base);
        input.close();
    }
}