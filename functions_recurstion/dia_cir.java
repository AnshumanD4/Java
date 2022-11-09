package functions_recurstion;
import java.util.Scanner;
public class dia_cir {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        dia(radius);
        area(radius);
        circu(radius);
        input.close();
    }
    static void dia(Float r){
        Float result = 2 * r;
        System.out.printf("Diameter: %f\n", result);
    }
    static void area(Float r){
        double result =  3.14*r*r;
        System.out.printf("Area: %f\n", result);
    }
    static void circu(Float r){
        double result = (2*3.14*r);
        System.out.printf("Circumference : %f", result);
    }
    
}
