package functions_recurstion;
import java.util.ArrayList;
public class Subseq {
 static ArrayList<String> subSeq(String str) {
    if(str.length()==0){
        ArrayList<String> empArrayList=new ArrayList<>();
        empArrayList.add("");
        return empArrayList;
    }
    char currentChar=str.charAt(0);
    String remString = str.substring(1);
    ArrayList<String> temp=subSeq(remString);
    ArrayList<String> result=new ArrayList<>();
    for(String s:temp){
        result.add(s);
        result.add(currentChar+s);
    }
    return result;
    }
    public static void main(String[] args) {
    String str="123";
    ArrayList<String> list =subSeq(str);
    System.out.println(list);
    } 
}
