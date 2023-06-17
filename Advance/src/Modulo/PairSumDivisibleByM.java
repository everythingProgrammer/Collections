package Modulo;

import java.util.ArrayList;
import java.util.HashMap;

public class PairSumDivisibleByM {
    /*
    public int solve(ArrayList<Integer> A, int B) {

        long ways  = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i = 0 ;i<A.size(); i++){

            int val = A.get(i)%B;
            if(map.containsKey(B-val)){
                ways= (ways+map.get(B-val)%1000000007)%1000000007;
            }
            map.put(B-val,map.getOrDefault(B-val,0)+1);

        }

//        fact(n) / (fact(r) * fact(n-r));

        if(! (map.get(0)<2))
            ways = ways +  (fact(map.get(0))/( 2 * fact(map.get(0)-2)))% 1000000007;

        return (int) ways;

    }
    */

    public static int solve(ArrayList<Integer> A, int B){

        long ways = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i= 0 ; i<A.size(); i++){
            int value = A.get(i)%B;
            map.put(value, map.getOrDefault(value,0)+1);
        }

//        if(map.get(0)>2)
//            ways = ways +    (fact(map.get(0))/(2* fact(map.get(0)-2)))%1000000007;
//        else if( map.get(0)==2)
//            ways= ways+1;

        for(int i = 0 ; i<A.size(); i++){

            int req = B-A.get(i);
            if(map.containsKey(req)){
                ways = ( ways + map.get(req)%1000000007 )%1000000007;
            }

        }
        return (int) ways;
    }

    static int fact(int number) {
        int f = 1;
        int j = 1;
        while(j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        solve(list,2);
        return ;
    }
}
