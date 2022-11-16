package functions_recurstion;

public class neew {
    public static void main(String[] args) {
        String str = "xyxxyyx";
        str = replace(str, 0);
        System.out.println(str);
    }
    static String replace (String str, int i){
        if(i == str.length()){
            return "";
        }
        if(str.charAt(i) == str.charAt(i+1)){
            System.out.println("you are right");
            return null;
        }
        else{
            return str.charAt(i) + replace(str, i+1);
        }
    }
}
