package Week2;

import java.util.ArrayList;

public class ClosestMinMax {


    public static int solve(ArrayList<Integer> A) {

        int min  = A.get(0);
        int max = A.get(0);
        for(int i = 0 ;i<A.size(); i++){
            if(A.get(i) > max){
                max=A.get(i);
            }
            if(A.get(i)<min){
                min = A.get(i);
            }
        }
        int length = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        for(int i = 0 ; i<A.size(); i++){

            if(A.get(i) == min){
                minIndex = i;
                if(maxIndex !=-1){
                    length = Math.min(length , Math.abs(i+1-maxIndex)  );
                }
            }
             if(A.get(i) == max){
                maxIndex = i;
                if(minIndex !=-1){
                    length = Math.min(length , Math.abs(i+1-minIndex)  );
                }
            }
        }
        return length;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new  ArrayList<>();
        nums.add(814);
        nums.add(716);
        nums.add(697);
        nums.add(483);
        nums.add(981);

//        nums.add(4);
//        nums.add(4);
//        nums.add(4);
//        nums.add(4);

        System.out.println(solve(nums));

    }


}
