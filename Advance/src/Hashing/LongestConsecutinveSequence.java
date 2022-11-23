package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutinveSequence {


    public int longestConsecutive(final int[] A) {

        HashSet<Integer> hset = new HashSet<>();
        // add all elements to hashsets
        for(int i = 0 ; i<A.length ; i++){
            hset.add(A[i]);
        }

        int len = 0;
        // now traverse whole array to search for begining element

        for(int i = 0 ; i<A.length ; i++){

            // if hashset does not contains  x-1 for x then, x is allowed to form chain

            if( !hset.contains(A[i]-1)){
                int currLen = 0;
                int currElement = A[i];
                while(true){
                    currLen ++;
                    currElement ++;
                    if( !hset.contains(currElement)){
                        break;
                    }
                }
                if(currLen > len){
                    len = currLen;
                }
            }


        }

        return len;


    }
}
