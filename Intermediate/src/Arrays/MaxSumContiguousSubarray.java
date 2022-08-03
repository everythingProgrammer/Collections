package Arrays;

import java.util.List;

public class MaxSumContiguousSubarray {


    // O(N^2) approach using loops from lecture
    // Failing with TLE
    public int maxSubArray(final List<Integer> A) {

        int maxSum = Integer.MIN_VALUE;
        int n = A.size();
        for(int i = 0 ; i<n ; i++){

            int sum = 0;
            for(int j = i ; j<n; j++){
                sum  = sum+ A.get(j);
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }

    // Using Kdane's algorithm
    public int maxSubArray(final List<Integer> A){

        int maxSum = Integer.MIN_VALUE;
        int n = A.size();
        int currmax = 0;
        for(int i = 0 ; i<n; i++){
            currmax = currmax+A.get(i);
            if(maxSum<currmax){
                maxSum= currmax;
            }
            if(currmax<0)
                currmax=0;
        }
        return maxSum;
    }


    public static void solve(){
        int nums [] = {1,2,3};
        int sum = 0;
        for(int i = 0 ; i<nums.length; i++){
            
        }
    }


}
