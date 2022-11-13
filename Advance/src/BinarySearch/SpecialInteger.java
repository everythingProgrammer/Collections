package BinarySearch;

import java.util.ArrayList;

public class SpecialInteger {
    public int solve(ArrayList<Integer> A, int B) {

        int l = 1;
        int r = A.size();
        int mid = 0;
        int ans = 0;
        while(l<=r){

            mid = (l+r)/2;

            if(check(A,B,mid)){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }

        }
        return ans;

    }

    public boolean check(ArrayList<Integer> A , int B , int k){

        long sum = 0;
        for(int i = 0 ; i<k ;i++){
            sum+=A.get(i);
        }
        if(sum>B){
            return false;
        }
        for(int i = k ; i<A.size(); i++){
            sum+= A.get(i);
            sum-= A.get(i-k);
            if(sum>B){
                return false;
            }
        }
        return true;
    }

}
