package DDArrays;

import java.util.ArrayList;
import java.util.List;

public class MainDiagSum {


    public int solve(final List<ArrayList<Integer>> A) {

        int sum = 0;

        for(int  i = 0 ; i<A.size(); i++){
            for(int j = 0 ; j<A.size() ; j++){
                if(i== j){
                    sum+=A.get(i).get(j);
                }
            }
        }
        return sum;

    }


}
