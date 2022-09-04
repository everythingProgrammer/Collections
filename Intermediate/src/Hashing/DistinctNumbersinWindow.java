package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DistinctNumbersinWindow {


    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        HashMap<Integer,Integer> hmap = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        if(B>A.size()){
            return ans;
        }

        for(int i = 0 ; i<B; i++){
            hmap.put(A.get(i),hmap.getOrDefault(A.get(i),0)+1);
        }


        for(int i = B  ;  i<A.size() ; i++){

            ans.add(hmap.size());
            // adding element at B
            hmap.put(A.get(i),hmap.getOrDefault(A.get(i),0)+1);

            // removing element at B-i .
            if(hmap.get(A.get(i-B)) == 1){
                hmap.remove(A.get(i-B));
            }else{
                hmap.put(A.get(i-B), hmap.get(A.get(i-B))-1);
            }
        }
        ans.add(hmap.size());
        return  ans;

    }


    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        int B = 3;
        for(int i = 0 ; i<N ; i++){
            ans.add(sr.nextInt());
        }
        System.out.println(solve(ans,B ));
    }
}
