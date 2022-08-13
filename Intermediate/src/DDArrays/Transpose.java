package DDArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Transpose {
    public static  ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();

        for(int i = 0 ; i<A.get(0).size(); i++){
            ans.add(new ArrayList<>());
        }

        for(int i = 0 ; i<A.size(); i++){
            for(int j = 0; j<A.get(0).size(); j++){
                ans.get(j).add(A.get(i).get(j));
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        for(int i = 0 ; i<a; i++){
            ArrayList<Integer> elements = new ArrayList<>();
            for(int j  = 0; j<b ; j++){
                elements.add(sr.nextInt());
            }
            A.add(elements);
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = solve(A );
        for(ArrayList<Integer>  t: ans){
            System.out.println(t);
        }


    }

}
