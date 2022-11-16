package functions_recurstion;

public class neew {
    static String output = "";
    public static void main(String[] args) {
        String s = "xyxxyyx";
        replace(s, 0);
        System.out.println(output);
    }
    static String replace (String s, int i){
        output = output + s.charAt(i);
        if(i == s.length()-1){
            return "";
        }
        if(s.charAt(i)==s.charAt(i+1)){
           output = output + "*" ;
        }
        return replace(s, i+1);
    }
}
