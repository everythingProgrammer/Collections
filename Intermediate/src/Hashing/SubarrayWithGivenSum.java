package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithGivenSum {


    public static  ArrayList<Integer> solve(ArrayList<Integer> A, int B)  {

        long psum  = 0;
        HashMap<Long,Integer> hmap = new HashMap<>();
        int length = A.size()+1;
        int left = 0 ;
        int right = 0;
        boolean nextLoop  = true;
        for(int i = 0 ; i<A.size() && nextLoop ; i++){

            psum  = psum+A.get(i);
            long ai =  psum - B;
//            System.out.println("A[i] "+A.get(i)+  ", i = " + i + ", psum = " + psum + ", ai=" + ai + ", ");

            if(ai == 0){
                int indx = 0;
                nextLoop = false;
                right = i;
                left = 0;
                break;
            }
            else if(hmap.containsKey(   ai)){
                int indx = hmap.get(ai);
                nextLoop = false;
                right = i;
                left = indx+1;
                break;
            }
            hmap.put(psum,i);

        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(nextLoop == true){
            ans.add(-1);
            return ans;
        }
        for(int i = left ; i<= right; i++){

            ans.add(A.get(i));
        }
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        int B = 5;
        for(int i = 0 ; i<N ; i++){
            ans.add(sr.nextInt());
        }
        System.out.println(solve(ans,B ));
        
    }
}
