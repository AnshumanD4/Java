package java_Day2;
import java.util.Scanner;

public class p12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alphabet = input.next().charAt(0);
        int ch = (int) alphabet;
        if (( ch == (65&97)) || (ch == (69&101)) || ( ch == (105 & 73)) || (ch == (111&79))|| ( ch == (117&85))){
            System.out.println("Vowel");
        }
        else 
        System.out.println("Consonant");

        input.close();
    }
}
