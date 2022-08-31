package Hashing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//https://www.scaler.com/academy/mentee-dashboard/class/32200/assignment/problems/4202?navref=cl_tt_nv
public class SubarrayWith0 {


    public static  int solve(ArrayList<Integer> A) {

        HashMap<Long,Integer> map = new HashMap<>();
//        HashMap<Integer,Integer> freq = new HashMap<>();
        long continousSum = 0 ;
        long subsLength = 0;
        for(int i = 0 ; i<A.size() ; i++){

            continousSum  += A.get(i);
//            freq.put(continousSum,freq.getOrDefault(continousSum,0)+1);


            if(continousSum == 0){
                subsLength = i+1;
            }else if( map.containsKey(continousSum) ){
                int prevIndx = map.get(continousSum);

                if( (i - prevIndx)>  subsLength  ){
                    subsLength = (i-prevIndx);
                }


            }else{
                map.put(continousSum,i);
            }
        }
        if(subsLength>0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        for(int i = 0 ; i<N ; i++){
            ans.add(sr.nextInt());
        }
        System.out.println(solve(ans));

    }

}
