package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialIndex {

    public static int solve(ArrayList<Integer> A) {


        /*
         *  If any index is deleted   the evenPrefixSum and OddPrefixSum  for i-1 stays same
         *  but  from i+1  oddPrefixSum becomes evenPrefixSum and viceVersa because on deleting indexes get switched
         */

        ArrayList<Integer> eps = new ArrayList<>();
        ArrayList<Integer> ops = new ArrayList<>();
        eps.add(A.get(0));
        /*
         * Create even Prefix Sum
         */
        for(int i = 1; i<A.size() ; i++){
            if((i | 1) > i){
                eps.add(A.get(i)+eps.get(i-1) );
            }else{
                eps.add(eps.get(i-1));
            }
        }
        ops.add(0);
        /*
         * Create odd prefix sum
         */
        for(int i = 1; i<A.size(); i++){
            if((i|1)== i){
                ops.add(A.get(i)+ops.get(i-1));
            }else{
                ops.add(ops.get(i-1));
            }
        }
        int count = 0;
        int SumOfEven = 0;
        int SumOfOdd = 0;
        for(int i = 0 ; i<A.size(); i++){

            if(i == 0){
                 SumOfEven = 0+ ops.get(ops.size()-1) - ops.get(i);
                 SumOfOdd = 0+ eps.get(eps.size()-1) -eps.get(0);
                if(SumOfEven== SumOfOdd){
                    count++;
                }
                continue;
            }
            SumOfEven = eps.get(i-1) + ops.get(ops.size()-1) - ops.get(i);
            SumOfOdd = ops.get(i-1) + eps.get(eps.size()-1) - eps.get(i);
            if( SumOfEven == SumOfOdd){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        for(int i = 0 ;i<N ; i++){
            nums.add(sr.nextInt());
        }
        System.out.println(solve(nums));

    }


    private int cntIndexesToMakeBalance(int arr[], int n)
    {
        if (n == 1) {
            return 1;
        }

        if (n == 2)
            return 0;

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            }
            else {
                sumOdd += arr[i];
            }
        }

        int currOdd = 0;
        int currEven = arr[0];
        int res = 0;
        int newEvenSum = 0;
        int newOddSum = 0;

        for (int i = 1; i < n - 1; i++) {
            if (i % 2 == 1) {
                currOdd += arr[i];
                newEvenSum = currEven + sumOdd
                        - currOdd;
                newOddSum = currOdd + sumEven
                        - currEven - arr[i];
            }
            else {
                currEven += arr[i];
                newOddSum = currOdd + sumEven
                        - currEven;
                newEvenSum = currEven + sumOdd
                        - currOdd - arr[i];
            }
            if (newEvenSum == newOddSum) {
                res++;
            }
        }
        if (sumOdd == sumEven - arr[0]) {
            res++;
        }
        if (n % 2 == 1) {
            if (sumOdd == sumEven - arr[n - 1]) {
                res++;
            }
        }
        else {
            if (sumEven == sumOdd - arr[n - 1]) {
                res++;
            }
        }
        return res;
    }

    public int solve(int[] A) {
        int n = A.length;
        return cntIndexesToMakeBalance(A, n);
    }
}
