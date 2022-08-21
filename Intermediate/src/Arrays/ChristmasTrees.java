package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ChristmasTrees {

    public static int solve(ArrayList<Integer> nums, ArrayList<Integer> B){

        int cost = Integer.MAX_VALUE;
        if(nums.size()<3){
            return -1;
        }
        if(nums.size() == 3 ){
            if(nums.get(0) < nums.get(1) && nums.get(1) < nums.get(2)){
                cost = B.get(0)+B.get(1)+B.get(2);
            }
            else{
                return -1;
            }
        }

        for(int  j = 1; j<nums.size()-1; j++){
            int Aj = nums.get(j);
            int lessThanJ = 0;
            int greaterThanJ= 0;
            int minLess = Integer.MAX_VALUE;
            int maxLess = Integer.MAX_VALUE;
            for( int innerLoop = 0; innerLoop <j; innerLoop++) {
                if (innerLoop < j && nums.get(innerLoop) < Aj) {
//                    lessThanJ++;
                    if (B.get(innerLoop) < minLess) {
                        minLess = B.get(innerLoop);
                    }
                }
            }
            for( int innerLoop = j+1; innerLoop <nums.size(); innerLoop++){
                if(  innerLoop >j  && nums.get(innerLoop)>Aj){
//                    greaterThanJ++;
                    if(B.get(innerLoop) < maxLess){
                        maxLess = B.get(innerLoop);
                    }
                }
            }
            if(maxLess == Integer.MAX_VALUE || minLess == Integer.MAX_VALUE)
                continue;
            cost = Math.min(cost , maxLess+  minLess+B.get(j));
        }
        System.out.println(cost);
        if(cost == Integer.MAX_VALUE)
            cost = -1;
        return cost;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
         int a = sr.nextInt();
         int b = sr.nextInt();
         for(int i = 0  ; i<a ; i++){
             A.add(sr.nextInt());
         }
         for(int i = 0 ; i<b ; i++){
             B.add(sr.nextInt());
         }

        solve(A,B);
    }


}
