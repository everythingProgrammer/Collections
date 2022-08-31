package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class LargestContigousZeroSubsequence {


    public ArrayList<Integer> lszero(ArrayList<Integer> A) {

        HashMap<Long,Integer> map = new HashMap<>();
//        HashMap<Integer,Integer> freq = new HashMap<>();
        long continousSum = 0 ;
        long subsLength = 0;
        int left = 0;
        int right = 0;
        for(int i = 0 ; i<A.size() ; i++){

            continousSum  += A.get(i);
//            freq.put(continousSum,freq.getOrDefault(continousSum,0)+1);


            if(continousSum == 0){
                subsLength = i+1;
                left = 0;
                right = i;
            }else if( map.containsKey(continousSum) ){
                int prevIndx = map.get(continousSum);

                if( (i - prevIndx)>  subsLength  ){
                    subsLength = (i-prevIndx);
                    left = prevIndx+1;
                    right = i;
                }


            }else{
                map.put(continousSum,i);
            }
        }


        ArrayList<Integer> ans = new ArrayList<>();
        if(subsLength<=0){
            return ans;
        }

        for(int i = left;  i<=right ; i++){
            ans.add(A.get(i));
        }
return ans;

    }
}
