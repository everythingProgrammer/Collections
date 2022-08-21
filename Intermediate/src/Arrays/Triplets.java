package Arrays;

import java.util.ArrayList;

public class Triplets {

/*
        Count of Triplets such that     A[i] < A[j] < A[k]  where i<j<k

 */


    public static int solve(ArrayList<Integer> nums){

        int count = 0;

        for(int  j = 1; j<nums.size()-1; j++){
            int Aj = nums.get(j);
            int lessThanJ = 0;
            int greaterThanJ= 0;
            for( int innerLoop = 0; innerLoop < nums.size(); innerLoop++){
                if(innerLoop<j && nums.get(innerLoop)< Aj ){
                    lessThanJ ++;
                }
                if(  innerLoop >j  && nums.get(innerLoop)>Aj){
                    greaterThanJ++;
                }
            }
            count += greaterThanJ* lessThanJ;
        }
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(6);
        nums.add(9);
        nums.add(12);
        nums.add(5);
        nums.add(16);
        nums.add(8);
        nums.add(7);
        nums.add(11);

        solve(nums);

    }

}
