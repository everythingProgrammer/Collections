package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPositivity {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int maxCount = -1;
        int currcount = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> curAns = new ArrayList<>();
        for(int i = 0 ; i<A.size(); i++){

            if(A.get(i) >=0){
                currcount++;
                curAns .add(A.get(i));
                if(currcount > maxCount){
                    ans = curAns ;
                    maxCount = currcount;
                }
            }
            else if(A.get(i)<0){
                currcount = 0;
                curAns = new ArrayList<>();
            }
        }
        return ans;
    }

    /*
        Two Pointer Approach to get the indexes ...
     */
    public int[] solve(int[] A) {
        int size = 0, left = 0, right = 0;
        for (int l = -1, r = 0; r < A.length; r++) {
            if (A[r] >= 0) {
                if (size < r - l) {
                    size = r - l;
                    left = l;
                    right = r;
                }
            } else {
                l = r;
            }
        }
        int ans[] = new int[size];
        for (int i = left + 1; i <= right; i++) ans[i - left - 1] = A[i];
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        for(int i = 0  ;i<n ; i++){
            nums.add(sr.nextInt());
        }
        System.out.println(solve(nums));
    }
}
