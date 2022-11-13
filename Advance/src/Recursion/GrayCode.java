package Recursion;

import java.util.ArrayList;

public class GrayCode {

    public ArrayList<Integer> grayCode(int A) {

        if(A == 1){
            ArrayList<Integer> base = new ArrayList<>();
            base.add(0);
            base.add(1);
            return base;
        }

        ArrayList<Integer> smallAns = grayCode(A-1);

        for(int i = smallAns.size()-1; i>=0; i--){
            smallAns.add(smallAns.get(i) + (1<<(A-1)) );
        }
        return smallAns;
    }
    /*
        Time Complexity : 2^n
        Space Complexity : 2^n

     */

}
