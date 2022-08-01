package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {

    public static int solve(ArrayList<Integer> A) {
        if(A.size()==2){
            return Math.min(A.get(0),A.get(1));
        }
        if(A.size()==1){
            return -1;
        }
        int largest = A.get(0);
        int sLargest = Integer.MIN_VALUE;

        for(int i = 1; i<A.size(); i++){
            int num = A.get(i);
            if(num>= largest){
                sLargest = largest;
                largest = num;
            }
            else if(num>= sLargest){
                sLargest= num;
            }
        }
        return sLargest;

    }
    public static void main(String args[]){
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(-2);
    nums.add(-10);
    nums.add(-3);
    System.out.println(solve(nums));
    }


}
