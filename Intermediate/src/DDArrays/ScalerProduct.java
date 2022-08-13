package DDArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ScalerProduct {

    public static  ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {


        for(int i = 0 ; i<A.size(); i ++){
            for(int j = 0 ;j< A.get(i).size() ; j++){
                int product =  A.get(i).get(j) * B;
                A.get(i).remove(j);
                A.get(i).add(j,product);
            }
        }
        return A;

    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = 3;
        int M = 3;
        for(int i = 0 ; i<N; i++){
            ArrayList<Integer> in = new ArrayList<>();
            for(int j = 0; j<M; j++){
                in.add(sr.nextInt());
            }
            ans.add(in);
        }

        solve(ans,4);

    }
}
