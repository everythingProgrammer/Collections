package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SubarrayWith0Sum {
    public static int solve(int[] A) {

        int prefixSum = 0 ;

        HashMap<Integer,Integer> hmap = new HashMap<>();
        HashSet<Integer> hset = new HashSet<>();

        for(int i = 0 ; i<A.length ; i++){
            prefixSum += A[i];
            if(hset.contains(prefixSum)|| prefixSum == 0){
                return 1;
            }
            hset.add(prefixSum);
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {-1,1};

        System.out.println(solve(nums));

    }
}
