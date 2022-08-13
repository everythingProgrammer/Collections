package DDArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RowToColumn0 {



    public static  void off (int i , int j , ArrayList<ArrayList<Integer>> A ){

         // put 0's in row
        for(int a  = 0 ; a<A.get(i).size(); a++){
            A.get(i).remove(a);
            A.get(i).add(a,0);
        }
        for(int a = 0; a<A.size() ; a++){
            A.get(a).remove(j);
            A.get(a).add(j,0);
        }


    }


    public static  ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> pair = new ArrayList<>();
        for(int i = 0 ; i<A.size(); i++){
            for(int j = 0; j<A.get(i).size(); j++){
                ArrayList<Integer> p = new ArrayList<>();
                int numVal = A.get(i).get(j);
                if(A.get(i).get(j) == 0){
//                    System.out.println("Printing    "+i+" "+j+ "= "+numVal);
//                    System.out.println(A.get(i));
                    p.add(i);
                    p.add(j);
                    pair.add(p);
                }
            }
        }
        for(ArrayList<Integer> p: pair){
            off(p.get(0),p.get(1),A);
        }
        return A;
    }

    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = 10;
        int M = 10;
        for(int i = 0 ; i<N; i++){
            ArrayList<Integer> in = new ArrayList<>();
            for(int j = 0; j<M; j++){
                in.add(sr.nextInt());
            }
            ans.add(in);
            System.out.println(in);
        }
//        ans = solve(ans);

//        for(ArrayList<Integer> a: ans){
//            System.out.println(a);
//        }

    }


}
