package functions_recurstion;
public class time {
    public static void main(String[] args) {
        String str = "1+pi*4-pi*6";
        str =  replace(str, 0);
        System.out.println(str);
    }
    static String replace (String str, int i ){
        if (i == str.length()){
            return "";
        }
        if(str.charAt(i)== 'p' && str.charAt(i+1) == 'i'){
            return 3.14 + replace(str, i+2);
        }
        else{
            return str.charAt(i) + replace(str, i+1);
        }
    }
}
