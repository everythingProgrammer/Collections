package Week2;

import java.util.ArrayList;

public class PickFromBothSides {


    public static  int solve(ArrayList<Integer> A, int B) {

        ArrayList<Integer> fSum = new ArrayList<>(); //To store sum of B integers going forward
        ArrayList<Integer> bSum = new ArrayList<>(); // To store sum B integers comming from Backwards
        fSum.add(0); // adding 0 at 0 index so that won't have to take care when  fSum(0) + bSum(B) is done ...
        bSum.add(0); // Same reason as above

        // create fSum
        for(int i = 1 ; i<=B; i++){
            fSum.add(fSum.get(i-1)+A.get(i-1));
        }

        // create bSum
        int N = A.size();
        for(int i = 1; i<=B ; i++){
            bSum.add( bSum.get(i-1)+A.get(N-i) );
        }
        System.out.println("fSum "+fSum);
        System.out.println("bSum "+bSum);

        int maxSum = Integer.MIN_VALUE;
        for(int i = B ,   j = 0 ; j<= B && i >=0; i--,j++){
            int newSum = fSum.get(i)+bSum.get(j);
            maxSum = Math.max( maxSum,  newSum    );

        }
        System.out.println(maxSum);

        return maxSum;
    }


    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(9);
        nums.add(-2);
        nums.add(-3);
        nums.add(10);
        nums.add(5);
        solve(nums,5);

    }


}
