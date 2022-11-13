package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

/*
    This question is slightly different than taught in class...
    here the arrangement of stalls are not in acending order
    So some changes need to be done to standard code

    1 - l will start from  1 .
    2 - r will be maximum in A - minimum in A.
       -------------------------------------- Need to sort , upper mentioned things won't work at all -----------------
    In checkCows functions
    1 -  check the absolute difference between the cow last placed and new position of stall

 */
public class AggresiveCows {

    public int solve(ArrayList<Integer> A, int B) {

        Collections.sort(A);
        int l = 1;
        int r  = A.get(A.size()-1)-A.get(0);

        int ans = 0;
        int mid = 0;

        while (l<=r){
            mid = (l+r)/2;
            if(checkCows(A,B,mid)){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;

    }


    public boolean checkCows(ArrayList<Integer> A, int B , int d){

        int lastPlaced = A.get(0); // stores the point where last cow was placed
        int cowsplaced = 1;

        for(int i = 1 ; i<A.size(); i++){

            if( Math.abs(A.get(i)- lastPlaced) >= d){
                cowsplaced++;
                lastPlaced = A.get(i);
                if(cowsplaced == B){
                    return true;
                }
            }
        }
        return false;

    }

}
