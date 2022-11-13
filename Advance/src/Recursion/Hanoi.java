package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hanoi {

    public static  ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {

        return countHanoi(A,1,3,2,new ArrayList<>());

    }

    public static ArrayList<ArrayList <Integer>> countHanoi(int N, int src, int dest , int intd , ArrayList<ArrayList<Integer>> M){

        if(N==1){
            M.add( new ArrayList<>( Arrays.asList(new Integer[]{1, src, dest})) );
            return M;
        }


        countHanoi(N-1,src,intd,dest,M);
        ArrayList<Integer> step = new ArrayList<>();
        step.add(N);
        step.add(src);
        step.add(dest);
        M.add(step);
        countHanoi(N-1,intd,dest,src,M);

        return M;
    }


    public static void main(String[] args) {
       System.out.println( towerOfHanoi(2));
    }

}
