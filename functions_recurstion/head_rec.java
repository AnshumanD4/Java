package functions_recurstion;

public class head_rec {
    static void print(int n ){
        // base case
        if( n == 0){  
            return;
        }
        // small problem
        print(n - 1);
        // processing logic
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(5);
    }
}
