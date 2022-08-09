package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AntiDiagonals {

    public static ArrayList<Integer> printDiagonals(int Si, int Sj, ArrayList<ArrayList<Integer>>A){
        ArrayList<Integer> diag  = new ArrayList<>();
        int i = Si;
        int j = Sj;
        while(i<A.size() && j>=0){
            diag.add(A.get(i).get(j));
            j--;
            i++;
        }
        while(diag.size()<A.get(0).size()){
            diag.add(0);
        }
        return diag;
    }

    public static  ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int i = 0;
        int N  = A.size();
        for(i = 0 ;i<N ; i++){
            ans.add(printDiagonals(0,i,A));
        }
        for(i = 1; i<N ;i++){
            ans.add(printDiagonals(i,N-1,A));
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();

        for(int i = 0 ; i<N; i++)
            A.add(new ArrayList<>());

        for(int i = 0;i<N ; i++){
            for(int j = 0 ; j<N; j++){
                A.get(i).add(sr.nextInt());
            }
        }
        ArrayList<ArrayList<Integer>> ans = diagonal(A);
        for(ArrayList<Integer> a:ans){
            System.out.println(a);
        }
    }



}
