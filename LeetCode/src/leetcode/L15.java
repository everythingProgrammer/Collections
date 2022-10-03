package leetcode;

import java.util.*;

public class L15 {

    /* using hashmap

     */
    public static List<List<Integer>> threeSum(int[] nums) {

        if(nums.length <3){
            List<List<Integer>> s = new ArrayList<>();
            return s;
        }

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i< nums.length; i++){
            map.put(nums[i],i);
        }

        for(int i = 0 ; i<nums.length -2; i++){
            for(int j = i+1; j<nums.length -1; j++){
                int target = 0-nums[i]-nums[j];
                if(map.containsKey(target) && map.get(target)>j){
                    ans.add(Arrays.asList(nums[i],nums[j],target));
                    j = map.get(nums[j]);
                }
                i = map.get(nums[i]);
            }
        }

        return ans;
    }

    /*
    Using sliding window
     */
    public static List<List<Integer>> threeSumSlidingWindow(int nums[]){
        HashSet< List<Integer>> res = new HashSet<>();
        if(nums.length <3 ){
            List<List<Integer>> ans = new ArrayList<>();
            return ans;
        }
        Arrays.sort(nums);

        for(int i = 0; i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
                else if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k++;
                }
            }

        }
        return new ArrayList<>(res);
    }

    public static void main(String args[]){
        int nums[] =    {-4,-1,-1,-1,-1,-1,-1,2};

        System.out.println(threeSum(nums));


    }

}
