package functions_recurstion;

import java.util.HashMap;

public class character_count {
    public static void main(String[] args) {
        
    String str = "ram sharma";
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i = 0; i < str.length(); i++){
        char singleChar = str.charAt(i);
        if (singleChar == ' '){
            continue;
        }
        if(map.get(singleChar)==null){
            map.put(singleChar, 1);
        }
        else{
            int prevCount = map.get(singleChar);
            map.put(singleChar, prevCount + 1);
        }
    }
    System.out.println(map);
    }
}
