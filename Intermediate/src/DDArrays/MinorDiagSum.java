package DDArrays;

import java.util.ArrayList;
import java.util.List;

public class MinorDiagSum {

    public static void printSum(){
        // printing sum of i,j  in a  square matrix
        // to analyze where can it be ==  M
        for(int i = 0 ; i<4; i++){
            for(int j = 0; j<4 ; j++){
                System.out.print( (i+j)+" " );
            }
            System.out.println();
        }
    }


    public int solve(final List<ArrayList<Integer>> A) {

        int sum = 0;

        for(int  i = 0 ; i<A.size(); i++){
            for(int j = 0 ; j<A.size() ; j++){
                if(i + j == A.size()-1){
                    sum+=A.get(i).get(j);
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        printSum();
    }
}
