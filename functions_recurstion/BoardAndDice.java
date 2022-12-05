package functions_recurstion;

import java.util.ArrayList;

public class BoardAndDice {
    static ArrayList<String> getDice(int start, int target){
        if(start == target){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(start > target){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalResult = new ArrayList<>();
        for(int dice = 1; dice <= 3; dice++ ){
            int CurrentDice = dice + start;
            ArrayList<String> list = getDice(CurrentDice, target);
            for(String r: list){
                finalResult.add(r + dice);
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(getDice(0,5));
    }
}
