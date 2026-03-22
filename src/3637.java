class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<4){
            return false;
        }
        int startLow  = nums[0];
        int  p= -1;
        int q = -1;
        for(int i=1;i<nums.length ; i++){
            if(nums[i] > startLow){
                p = i;
                startLow = nums[i];
            }
            else if(nums[i]<startLow){
                break;
            }
            else if (nums[i] == startLow){
                return false;
            }
        }
        if(p == -1){
            return false;
        }
        int first_top= nums[p];
        for(int i = p+1; i<nums.length; i++ ){
            if(nums[i] < first_top){
                q = i;
                first_top = nums[i];
            }
            if(nums[i]>=nums[p]){
                break;
            }
        }
        if(q == -1){
            return false;
        }
        if(q == nums.length-1){
            return false;
        }
        // starting from q till end there should only be increase elements
        int firstLow = nums[q];
        for(int i = q+1  ; i<nums.length; i++ ){
            if(nums[i] <= firstLow){
                return false;
            }
            else{
                firstLow = nums[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,4,2,6};
        Solution s = new Solution();
        System.out.println(s.isTrionic(arr));
    }
}