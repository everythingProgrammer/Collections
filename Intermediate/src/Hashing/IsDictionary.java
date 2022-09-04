package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class IsDictionary {

    // return 1 if word1 > word2
    // return -1 if word1 < word2
    // return 0 if word1 == word2
    public static int compare(HashMap<Character,Integer>map , String word1, String word2){

        int count1; // To count value of word1
        int count2; // To count value of word2
//        if(word1.length() < word2.length()){
//            for(int i = 0 ; i<word1.length(); i++){
//                if(word1.charAt(i) > word2.charAt(i)){
//
//                }else if(word1.charAt(i)<word2.charAt(i)){
//
//                }
//            }
//        }else if( word1.length() > word2.length()){
//
//        }else if( word1.length() == word2.length()){
//
//        }


        // To check characters in common length
        for(int i = 0; i<  Math.min(word1.length() , word2.length()); i++){
            if(map.get( word1.charAt(i)) > map.get( word2.charAt(i))){
                return 1;
            }else if( map.get( word2.charAt(i))> map.get(word1.charAt(i))){
                return -1;
            }
        }

        // if all characters in common length are same , then the string with lesser elements is smaller
        if(word1.length()<word2.length()){
            return -1;
        }
        else if( word2.length() < word1.length()){
            return 1;
        }
        return 0;
    }


    public static int solve(ArrayList<String> A, String B) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<B.length(); i++){
            map.put(B.charAt(i), i+1 );
        }
        // if at any point  word[i] > word[i-1] then return 0
        // else return 1;
        for( int i = 1; i<A.size(); i++){

            if(compare(map,A.get(i-1),A.get(i)) == 1  ){
                return 0;
            }

        }
        return 1;

    }

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("scaler");
        arr.add("interviewbit");

        String B = "adhbcfegskjlponmirqtxwuvzy";

        System.out.println(solve(arr,B));
    }

}
