package ArraysAndMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoyerMoorN2 {
    public static  int repeatedNumber(final List<Integer> A) {

        int a = 0;
        int b = 0;
        int counta = 0;
        int countb = 0;
        for(int i = 0 ; i<A.size(); i++) {
            if (A.get(i) == a) {
                counta++;
            } else if (A.get(i) == b) {
                countb++;
            } else if (counta == 0) {
                counta++;
                a = A.get(i);
            } else if (countb == 0) {
                countb++;
                b = A.get(i);
            } else {
                counta--;
                countb--;
            }
        }
        counta = 0;
        countb = 0;
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) == a )
                    counta++;

                else if (A.get(i) == b)
                    countb++;
            }
            ArrayList<Integer> ans = new ArrayList<>();
            if(counta> A.size()/3){
                ans.add(a);
            }
            if(countb>A.size()/3){
                ans.add(b);
            }
            return -1;
        /*
            This type of checking can't be done , since in acount and bcount actual number of occurences were not stored in earliar approach , now on
            Manually count occurances of both a and b we can do this ...

         */
//        int maxEnc =acount>bcount?acount:bcount;
//        if( maxEnc >(int)  ( A.size()/3)){
//            return acount>bcount?a:b ;
//        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        for(int i = 0 ; i<n; i++){
            nums.add(sr.nextInt());
        }
        System.out.println(repeatedNumber(nums));
    }
}
