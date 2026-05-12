package src.HashMap;

import java.util.HashSet;

public class FindMaximumConsequtiveNumberSequence {
    // given an array nums[] find the longest subsequence

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        HashSet<Integer> set = new HashSet<>();
        int longestSequence = 0;
        for(int num: nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if( !set.contains(num-1)){
                // sequence start ,

                int currentNum = num;
                int currentLength = 1;
                while(set.contains(currentNum+1)){
                    currentNum+=1;
                    currentLength +=1;
                }
                longestSequence= Math.max(longestSequence,currentLength);
            }
        }
        System.out.println(longestSequence);
    }
}
