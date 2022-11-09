package functions_recurstion;

public class linear_rec {
    static void print(int n ){
        // base case
        if( n == 0){  
            return;
        }
        // processing logic
        else if (n%2!=0){
        System.out.println(n);
    }
        // small problemz
        print(n - 1);
        // processing logic
        if(n%2==0){
        System.out.println(n);
    }
        
    }
    public static void main(String[] args) {
        print(5);
    }
}
