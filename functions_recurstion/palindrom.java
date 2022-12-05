package functions_recurstion;

public class palindrom {
    static boolean ispalindrom(String s){
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return ispalindrom(s.substring(1));
        }
        return false;
    }
}
