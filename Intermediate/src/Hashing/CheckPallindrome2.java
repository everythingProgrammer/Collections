package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class CheckPallindrome2 {

    public static void main(String[] args) {

        String str = "mnxljrajwhxiaquajokwvoqqphylxpbanmmhfxsmssxzsdnprtgibuhaxnwxzfozexiascybplaaqjcthuydnoowmkzyamodzknkqmwdglqqnhflfslqyowcangsddhcjjuiyfbdkevlghbictrvnmnathotrekyrggwcmbzorqtyeowksywlbetsyhjvczcnvusfdrxythrhhoxtuuprqftgwohcgpngktkharijsovuknae";


        HashMap<Character,Integer> map =  new HashMap<Character, Integer>();

        // simply storing freq in Hashmap
        for(int i = 0;i<str.length() ; i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        // at max 1 element can have  odd occurrence
        int countOdd = 0;

        for(Character c : map.keySet()){
            if( (map.get(c)&1)==1 ){
                countOdd++;
            }
        }
        if(countOdd==1 || countOdd ==0){
//            return 1;
        }

//        return 0;

//
//        HashSet<Integer> hs = new HashSet<>();
//        int prev = 0;
////        hs.con
//        for(int i = 1 ; i<num.length ; i++ , prev=1){
//            int multiple = Integer.parseInt(num.charAt(i)) * prev;
//
//        }
    }


}
