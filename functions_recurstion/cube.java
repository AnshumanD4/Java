package functions_recurstion;
import java.util.Scanner; 
public class cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int result = cubee(a);
        System.out.println("Cube : " + result);
        input.close();
    }
    static int cubee(int a){
        int b = a*a*a;
        return b; 
    }
}
