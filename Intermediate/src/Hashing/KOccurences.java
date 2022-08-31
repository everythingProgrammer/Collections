package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class KOccurences {

    public static  int getSum(int A, int B, ArrayList<Integer> C) {


        HashMap<Integer,Integer> map = new HashMap<>();

        //Number of Trees = A
        // Frequency of Height required = B
        // Height Stored in C

        for(int i = 0  ;i< C.size() ; i++){
            int h = C.get(i);

            map.put(h,map.getOrDefault(h,0)+1);
        }
        boolean flag = false;
        int sum = 0;
        long M = 1000000007;
        for(int Key: map.keySet()) {
            if(map.getOrDefault(Key,0)== B){
                flag = true;
                sum = (int)  ((sum +   Key%M)%M );
            }
        }

        if(flag == true){
            return sum;
        }
        return -1;



    }



    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        int freq = sr.nextInt();
        for(int i = 0 ; i<N ; i++){
            ans.add(sr.nextInt());
        }
        System.out.println(getSum(N,freq,ans));

    }


}
