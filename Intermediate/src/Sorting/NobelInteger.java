package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NobelInteger {
    public static int solve(ArrayList<Integer> A) {

        Collections.sort(A,Collections.reverseOrder());
        int count = 0;
        int prev = A.get(0);
        if(prev == 0){
            return 1;
        }
        int greater = -1;
        for(int  i = 1; i<A.size(); i++){
            A.get(i);

            if(A.get(i) == A.get(i-1)){
                if(A.get(i) == greater)
                    return 1;
            }
            else{
                greater = i;
                if(A.get(i) == i){
                    return  1;
                }
            }
        }
        return -1;
    }


    /* removed some checks from solve */
    public static int solve2(ArrayList<Integer> A) {

        Collections.sort(A,Collections.reverseOrder());
        int prev = A.get(0);
        if(prev == 0){
            return 1;
        }
        int greater = -1;
        for(int  i = 1; i<A.size(); i++){
            A.get(i);
            if(A.get(i)==A.get(i-1)){
               continue;
            }
            if(A.get(i)== i){
                return 1;
            }

        }
        return -1;
    }


    /*
        Goes Forward instead of backwards ( above two sets array in decending order) , this one works on acending
     */
    public static int optimal(ArrayList<Integer> A){
            Collections.sort(A);
            int size = A.size();
            for(int i = 0; i < size; i++){
                while(i+1<size && A.get(i)==A.get(i+1))
                    i++;
                if(A.get(i) == size-1-i)
                    return 1;
            }
            return -1;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        for(int i = 0 ; i<N ; i++){
            nums.add(sr.nextInt());
        }
       System.out.println( optimal(nums));
    }
}
