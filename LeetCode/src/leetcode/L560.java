package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class L560 {
    public static int subarraySum(int[] nums, int k) {



        int psum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        for(int i = 0 ; i<nums.length ; i++){
            psum = psum+nums[i];
            int num = psum-k  ;
            if(map.containsKey(num )){
                count += map.get(num);
                map.put( psum,  map.getOrDefault(psum,0)+1  );
            }else {
                map.put(psum, map.getOrDefault(psum,0)+1);
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        int arr[] = new int[N];
        for(int i = 0;i<N; i++){
            arr[i] = sr.nextInt();
        }
        System.out.println(subarraySum(arr,0));

    }
}
