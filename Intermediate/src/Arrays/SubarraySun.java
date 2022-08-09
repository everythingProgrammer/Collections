package Arrays;

import java.util.ArrayList;

public class SubarraySun {



    public static  Long subarraySum(ArrayList<Integer> A) {

        int s = 1;
        int e = A.size() ;
        int n = A.size();
        int to;
        long sum  = 0L;
        for(int i = 0 ;i<n ; i++,s++,e--){
            to = s*e;     // Here   if we S*E  then   Integer*Integer results in Integer and for biggest calculation which will go in long this result itself will be in-correct
            sum +=  to*A.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);

        System.out.println(subarraySum(nums));

    }

}
