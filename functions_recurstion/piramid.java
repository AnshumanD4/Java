package functions_recurstion;

public class piramid {
    static void odd(int i, int j){
        if(i == 0){
            return;
        }
        System.out.println("*");
        odd((2*i) - 1,j+1);
    }
    public static void main(String[] args) {
        odd(5,0);
    }
}
