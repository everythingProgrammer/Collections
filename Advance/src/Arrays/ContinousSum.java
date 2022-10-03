package Arrays;

import java.util.ArrayList;

public class ContinousSum {

    public static  ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ;i < A ; i++){
            ans.add(0);
        }

        for(int i  = 0 ; i<B.size() ; i++){
            int start = B.get(i).get(0)-1;
            int end = B.get(i).get(1) ;
            int val = B.get(i).get(2);
            if(start>=0&& start <A){
                ans.set(start, ans.get(start)+ val);
            }
            if(end <A){
                ans.set(end,ans.get(end)-val);
            }
        }
        int carry = 0;
        for(int i = 0  ; i<A ; i++){
            ans.set(i, ans.get(i)+carry);
            carry = ans.get(i);
        }

    return ans;
    }


    public static void main(String[] args) {


    }
}
