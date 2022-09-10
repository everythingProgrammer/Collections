package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class GrayCode {

    public static ArrayList<Integer> grayCode(int a) {

    return calculateN(a);


    }

    public static ArrayList<Integer> calculateN(int a){

        if(a == 1){
            ArrayList<Integer> an = new ArrayList<>();
            an.add(0);
            an.add(1);
            return an;
        }
        ArrayList<Integer> gn = calculateN(a-1);

        ArrayList<Integer> rn = new ArrayList<>(gn);
        Collections.reverse(rn);

        ArrayList<Integer> ans = new ArrayList<>();
        for(int n:gn){
            ans.add(n);
        }
        int p = 1<<(a-1);
        for(int m: rn){
            ans.add(p|m);
        }
        return ans;
    }





    public static void main(String[] args) {
        System.out.println(grayCode(3));
    }

}
