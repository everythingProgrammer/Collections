package Arrays;


/*
    Maximum Even - Minimum Even
 */

import java.util.ArrayList;

public class MinimumPicks {

    public int solve(ArrayList<Integer> A) {
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;

        for(int i = 0; i<A.size() ; i++) {
            int num = A.get(i);
            if ((num | 1) > num) {
                if(num>maxEven){
                    maxEven = num;
                }
//                System.out.println("Number is Even");
            } else {
                if(num<minOdd){
                    minOdd = num;
                }
//                System.out.println("Number is Odd");
            }
        }
        return maxEven- minOdd;


    }

}
