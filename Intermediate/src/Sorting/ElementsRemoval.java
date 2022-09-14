package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemoval {


    /*
        Optimal DesignLinkedList.java
     */
    public int optimal(ArrayList<Integer> A) {

        Collections.sort(A);
        int sum = 0, ans = 0;

        for(int i=0;i<A.size();i++)
        {
            sum += (A.size()-i)*A.get(i);
        }

        return sum;
    }

    /*
        my solution
     */
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int sum = 0;
        for(int i =  0 ; i<A.size(); i++){
            sum += A.get(i);
        }
        int minCost = 0;
        for(int i = A.size()-1; i>=0 ; i--){
            minCost = minCost+sum;
            sum -= A.get(i);
        }
        return minCost;
    }
}
