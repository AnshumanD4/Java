package functions_recurstion;

class pattern1{
    static void blank(int i, int j){
        if(i==0){
            return;
        }
        space(i-1);
        star(j+1);
        blank(i-1, j+1);
    }
    static void space(int n){
        if(n == 0){
            return;
        }
        System.out.print("A");
        space(n-1);
    }
    static void star(int n){
        if(n == 0){
            return;
        }
        System.out.print("B");
        star(n-1);
    }
    public static void main(String[] args) {
        blank(5, 0);
    }
}