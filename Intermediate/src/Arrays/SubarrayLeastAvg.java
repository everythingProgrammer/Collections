package Arrays;

import java.util.ArrayList;

public class SubarrayLeastAvg {


    public static  int solve(ArrayList<Integer> A, int B) {

        // Creating Prefix Sum
        ArrayList<Long> pSum = new ArrayList<>();
        pSum.add(Long.valueOf(A.get(0)));
        for(int i = 1 ; i<A.size(); i++){
            pSum.add(A.get(i)+pSum.get(i-1));
        }
        double currSum = 0;
        double minSum = Integer.MAX_VALUE;
        int indx = 0;
        for(int i = B-1 ; i<A.size() ; i++){
            if(i-B <0)
            {
                double num = pSum.get(i);

                currSum =(double) (pSum.get(i)) /B;

            }
            else {
                currSum = (double) (pSum.get(i) - pSum.get(i-B))/B;
            }
            if(minSum > currSum){
                minSum = currSum;
                indx = i-B+1 ;
            }
        }
        return indx>-1?indx:0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(3);
        nums.add(13);
        nums.add(5);
        nums.add(10);
        nums.add(14);
        nums.add(8);
        nums.add(5);
        nums.add(11);
        nums.add(9);
        nums.add(1);
        nums.add(11);
        int B = 9;
        System.out.println(solve(nums,B));
    }

}
