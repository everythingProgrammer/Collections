package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {
    public static  int solve(ArrayList<Integer> A, int B) {

        for(int i  = 0 ; i<A.size(); i++){

            for(int j = i+1; j<A.size(); j++){
                if(A.get(i)+A.get(j) == B){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
//        nums.add(3);
        nums.add(4);

        System.out.println(solve(nums,4));
    }


}
