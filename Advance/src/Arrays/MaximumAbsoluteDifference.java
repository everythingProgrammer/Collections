package Arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

/*
    Brute Force
 */
    public int maxArr2(ArrayList<Integer> A) {

        int maxDiff = 0;
        int currDiff = 0;
        for(int i = 0 ; i<A.size(); i++){


            for(int j = i+1; j<A.size(); j++){

                currDiff = Math.abs(A.get(j)-A.get(i))+ (j-i);
                maxDiff = Math.max(currDiff,maxDiff);
            }
        }
        return maxDiff;

    }

    public int maxArr(ArrayList<Integer> A) {


        int e1 = 0;
        int e2 =0;
        int e1max = Integer.MIN_VALUE;
        int e1min = Integer.MAX_VALUE;
        int e2max  = Integer.MIN_VALUE;
        int e2min  =Integer.MAX_VALUE;

        for(int i = 0  ; i<A.size() ; i++){

            e1max = Math.max(e1max, A.get(i)-i);
            e1min = Math.min(e1min , A.get(i)-i);
            e2max = Math.max(e2max, A.get(i)+i);
            e2min = Math.min(e2min, A.get(i)+i);
        }
        return Math.max(  e1max-e1min,e2max-e2min   );

    }

}
