package functions_recurstion;
import java.util.Scanner;
public class recu_pow{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int power = input.nextInt();
        float result = find_pow(base,power);
        System.out.printf("Result = %f", result);
        input.close();
    }   
    static float find_pow(int base , int power){
        if( power == 0){
            return 1;
        }
        else if (power > 0){
            return (base*find_pow(base, power-1));
        }
        else{
            return (1/(base*find_pow(base, -(power+1))));
        }
    }

}
