package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixSubstraction {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0 ;i<A.size() ; i++){
            ArrayList<Integer> row  = new ArrayList<>();
            for(int j = 0; j<A.get(0).size(); j++){

                int a  = A.get(i).get(j);
                int b = B.get(i).get(j);
                row.add(a-b);
            }
                ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B  = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        int M = sr.nextInt();

        for(int i = 0 ; i<N; i++){
            ArrayList<Integer> elements = new ArrayList<>();
            for(int j  = 0; j<M ; j++){
                elements.add(sr.nextInt());
            }
            A.add(elements);
        }
        for(int i = 0 ; i<N; i++){
            ArrayList<Integer> elements = new ArrayList<>();
            for(int j  = 0; j<M ; j++){
                elements.add(sr.nextInt());
            }
            B.add(elements);
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = solve(A,B);
        for(ArrayList<Integer> a: ans){
            System.out.println(a);
        }


    }

}
