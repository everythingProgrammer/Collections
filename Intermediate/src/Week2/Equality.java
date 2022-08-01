package Week2;

import java.util.ArrayList;

public class Equality {
    public static int solve(ArrayList<Integer> A) {
        int max  = A.get(0);
        for(int i = 0 ; i<A.size(); i++){
            if (A.get(i) > max) {
                max = A.get(i);
            }
        }
        int count = 0;
        for(int i = 0 ; i<A.size() ; i++){
            count += (max - A.get(i));
        }

        return count;
    }

    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        System.out.println(solve(nums));
    }
}
