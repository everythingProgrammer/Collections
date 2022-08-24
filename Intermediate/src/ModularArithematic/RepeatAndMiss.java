package ModularArithematic;

import java.util.ArrayList;
import java.util.List;

public class RepeatAndMiss {

    public static  ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        int xor = 0;
        for(int i = 0; i<A.size(); i++){
            xor = xor^ A.get(i);
        }

        for(int i = 1; i<=A.size() ; i++){
            xor = xor^ i;
        }
        //now XOR has  rightmost bit set as 1 number
        xor = xor & (~(xor -1));

        int a = 0;
        int b = 0;
        // Do loops again
        for(int i = 0 ; i<A.size(); i++){

            if((A.get(i) & xor) != 0){
                a = a^ A.get(i);
            }else{
                b = b^A.get(i);
            }
        }
        for( int i = 1; i<=A.size() ; i++){

            if( (i & xor) != 0){
                a = a^i;
            }else{
                b = b ^i;
            }
        }
        // now I have both  a and b one of them is repeating other is non repeating
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i<A.size() ; i++){
            if(A.get(i) == a){
                ans.add(a);
                ans.add(b);
                break;
            }
            else if (A.get(i) == b){
                ans.add(b);
                ans.add(a);
                break;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        ans.add(2);
        ans.add(2);
        ans.add(3);
        ans.add(5);
        System.out.println(repeatedNumber(ans));
    }

}
