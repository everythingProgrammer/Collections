package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubarray {


    public static int maxSubarray(int A, int B, ArrayList<Integer> C) {
        ArrayList<Integer> psum = new ArrayList<>();
        psum.add(0);
        for(int i = 1 ; i<=A; i++){
            psum.add(C.get(i-1)+psum.get(i-1));
        }
        int l = 1 ; int r = 1;
        int max= Integer.MIN_VALUE;

//        for(int i = 0  ; i<psum.size() ; i++){
//            if(psum.get(i)>max && psum.get(i)<=B){
//                r= i;
//                max = psum.get(i);
//            }
//            else if(psum.get(i)>B){
//                break;
//            }
//        }
        while(  (l<=r) && r<psum.size() ){

            if(psum.get(r)- psum.get(l-1) > B ){
                if(l==r){
                    l++;
                    r++;
                }else{
                l++;
                }
            }
            else if(psum.get(r)-psum.get(l-1)<=B){
                max = Math.max(max,psum.get(r)-psum.get(l-1));
                r++;
            }
        }
        return Math.max(max,0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //34, 75, 69, 43, 8, 34, 54, 79, 7, 39, 64, 85, 37, 14, 50, 40, 78,
        // 5, 98, 13, 89, 45, 30, 66, 50, 90, 28, 13, 64, 44, 78, 58, 94, 100,
        // 65, 88, 69, 48, 41, 64, 56, 60, 100, 95, 96, 66, 11, 92, 32, 17, 65,
        // 39, 42, 90, 37, 20, 21, 24, 93, 47, 26
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        for(int i =0;i<num; i++){
            nums.add(sr.nextInt());
        }
        System.out.println(maxSubarray(7,8,nums));
    }
}
