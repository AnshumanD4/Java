import java.util.ArrayList;

public class permutation {
    static void printArrayList(ArrayList<String> arrl){
        arrl.remove("");
        for(int i=0;i<arrl.size();i++)
        System.out.print(arrl.get(i)+" ");
    }
    public static ArrayList<String> getPermutation(String str){
        if(str.length()==0)
      //  ArrayList<String> empty = new ArrayList<>();
        //empty.add("");
        //return empty;

        ArrayList<String> p=new ArrayList<>();
    }
    char ch=str.charAt(0);
    String substr=str.substring(1);
    ArrayList<String> prevResult=getPermutation(substr);
    ArrayList<String> result=new ArrayList<>();
    for(String val:prevResult){
        for(int i=0;i<val.length();i++){
            result.add(val.substring(0,i)+ch+val.substring(i));
        }
    }
    return result;
}
public static void main(String[] args){
    String str="abc";
    printArrayList(getPermutation(str));
}
}