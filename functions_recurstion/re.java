package functions_recurstion;
class re{
    static int [] sum(int num, int count){
        //termination case
        if(num == 0){
            //array return;
            int arr[] = new int [2];
            return arr;
        }
        //small problem + cycle (recursion) + processing logic;
        int arr[] = sum(num/10, count+1);
        if(count%2 == 0){
            arr[1] = arr[1] + num%10;
        }
        else{
            arr[0] = arr[0] + num%10;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = sum(-12435,0);
        System.out.println("Odd sum: "+ arr[0]);
        System.out.println("Even Sum: "+ arr[1]);
    }
}