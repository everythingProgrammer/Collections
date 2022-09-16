package leetcode;

public class L152 {
    static long  maxProduct(int[] nums, int n) {
        if(nums.length ==  1) {
            return nums[0];
        }

        long current_max = nums[0];
        long current_min = nums[0];
        long global_max = nums[0];

        for(int i = 1 ; i< nums.length ; i++) {
            long temp = current_max;
            System.out.println("current max "+current_max);
            System.out.println("current min "+current_min);

            current_max = Math.max(Math.max(current_max * nums[i],  current_min * nums[i]), nums[i]);
            current_min = Math.min(Math.min(temp * nums[i], current_min * nums[i]),nums[i]);

            if(current_max > global_max)
                global_max = current_max;
                System.out.println("new global max "+global_max);
        }

        return global_max;

    }

    public static void main(String args[]){
//        int nums [] = {6,-3,10,-2,-100};
//        int nums [] = {-1,-2,-3,-4,-5};
        int nums [] = { 2,3,-2,4 };

        System.out.println(maxProduct(nums,5));


    }
}
