package functions_recurstion;
import java.util.HashMap;
public class ch_count_re {
    public static void main(String[] args) {
        String str = "Ram Sharma";
        int length = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map = getCount(str, length , 0);
        System.out.println(map);
    }
    static HashMap<Character,Integer> getCount(String str, int len, int i){
        if(i == len){
            HashMap<Character, Integer> map = new HashMap<>();
            return map;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char singleChar = str.charAt(i);
        if(map.get(singleChar)==null){
            map.put(singleChar, 1);
        }
        else{
            int prevCount = map.get(singleChar);
            map.put(singleChar, prevCount + 1);
        }
        return map;
    }
}

