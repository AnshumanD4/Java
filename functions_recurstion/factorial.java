package functions_recurstion;

public class factorial {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        int smallproblem = fact(n-1);
        return n * smallproblem;
    }
    public static void main(String[] args) {
        int sol = fact(5);
        System.out.println("Factorial is : " + sol);
    }
}
