package Arrays;

import java.util.ArrayList;

public class EquilibriumIndex {

    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> ps = new ArrayList<>();
        ps.add(A.get(0));
        for(int i = 1 ; i<A.size(); i++){
            ps.add(A.get(i)+ps.get(i-1));
        }
        int indx = -1;
        for(int i = 0 ; i<A.size() ; i++){
            if(i == 0){
                if(ps.get(ps.size()-1) - ps.get(0) == 0){
                    indx = 0;
                    break;
                }
            }
            else if(ps.get(i-1) == ( ps.get(ps.size()-1) - ps.get(i) )){
                indx = i;
                break;
            }
        }
        return indx;
    }


    /*
     * Space Optimized
     */
    public static int solve(int[] A) {
        long sum1 = 0;
        for(int i = 0; i < A.length ; i++) sum1 += A[i];
        long sum2 = 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < A.length ; i++){
            sum1 -= A[i];
            if(sum1 == sum2){
                ans = i;
                break;
            }
            sum2 += A[i];
        }
        if(ans == Integer.MAX_VALUE)ans =- 1;
        return ans;
    }

    public static void main(String[] args) {

        int nums[] = {3,9,11,15,20};
        System.out.println(solve(nums));
    }


}
