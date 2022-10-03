package Arrays.Matrix;

import java.util.ArrayList;

public class SumOfAllSubmatrix {


    public int solve(ArrayList<ArrayList<Integer>> A) {

        int sum = 0;
        int n = A.size();
        for(int i = 0 ; i<A.size(); i++){
            for(int j=0; j<A.size(); j++){

                sum+= (i+1)*(j+1)*(n-i)*(n-j)*A.get(i).get(j);
            }
        }
        return sum;

    }

    public static void main(String[] args) {

    }



}
