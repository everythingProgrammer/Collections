package BinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

    public static int searchInsert(ArrayList<Integer> A, int B) {

        int l = 0;
        int r = A.size()-1;
        int mid = 0;

        while(l<=r){
            mid = (l + r)/2;
            if(A.get(mid) == B){
                return mid;
            }
            else if( A.get(mid) > B){
                r = mid-1;
            }else if(A.get(mid) < B){
                l = mid+1;
            }
        }
        if(B<A.get(mid)){
            return mid-1;
        }else{
            return mid+1;
        }
    }

    public static void main(String[] args) {
        Scanner sr  = new Scanner(System.in);
        ArrayList<Integer>nums  = new ArrayList<>();
        int n = sr.nextInt();
        for(int i = 0 ; i<n ; i++){
            nums.add(sr.nextInt());
        }
        int B = sr.nextInt();
        System.out.println(searchInsert(nums,B));
    }


}
