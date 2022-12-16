package StringPattern;

import java.util.ArrayList;
import java.util.HashMap;

public class PermutationAinB {

    public static int solve(String A, String B) {

        /* Following HashMap Method with TC: O(n*26) */


        HashMap<Character,Integer> pattern = new HashMap<>();
        for(int i = 0 ; i<A.length() ; i++){
            pattern.put(A.charAt(i), pattern.getOrDefault(A.charAt(i),0)+1);
        }
        HashMap<Character,Integer> currentMap = new HashMap<>();

        for(int i = 0 ; i<A.length(); i++){
            currentMap.put(B.charAt(i),currentMap.getOrDefault(B.charAt(i),0)+1);
        }
        int count = 0;
        if(compareMaps(pattern,currentMap)){
            count++;

        }
        int n = A.length();
        // A is pattern B is string
        for(int i = A.length() ; i<B.length(); i++){

            if( currentMap.get(B.charAt(i-n)) - 1== 0){
                currentMap.remove(B.charAt(i-n));
            }else{
                currentMap.put(B.charAt(i-n),currentMap.get(B.charAt(i-n))-1);
            }
            currentMap.put(B.charAt(i),currentMap.getOrDefault(B.charAt(i),0)+1);
            if(compareMaps(pattern,currentMap)){
                count++;
            }
        }

        return count;
    }
    public static boolean compareMaps(HashMap<Character,Integer>pattern , HashMap<Character,Integer> text ){
        // using for each loop to compare
        for(char a: pattern.keySet()){
            if((int) pattern.get(a) != (int) text.getOrDefault(a , 0)){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        solve("docp","aoapeooeoapcpaocecddoocdcqqapeapccc");
    }
}
