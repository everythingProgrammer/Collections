package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RangeSum {




    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Long> prefixSum = new ArrayList<>();
        prefixSum.add(0L);
//        prefixSum.add(A.get(0));

        for(int i = 1;i<=A.size(); i++){
            prefixSum.add(prefixSum.get(i-1)+A.get(i-1));
        }
        ArrayList<Long> ans = new ArrayList<>();
        for(ArrayList<Integer> nums: B){
            int L = nums.get(0);
            int R = nums.get(1);
            ans.add( (prefixSum.get(R)-prefixSum.get(L-1)));
        }

        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(7);
        A.add(3);
        A.add(1);
        A.add(5);
        A.add(5);
        A.add(5);
        A.add(1);
        A.add(2);
        A.add(4);
        A.add(5);
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        for(int i = 0; i<N ; i++){
            int a = sr.nextInt();
            int b = sr.nextInt();
            temp.add(a);
            temp.add(b);
            B.add(temp);
            temp  = new ArrayList<>();
        }

        System.out.println(rangeSum(A,B));
    }

}
