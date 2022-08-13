package DDArrays;

import java.util.ArrayList;

public class RowSum {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> ans = new ArrayList<>();

        for(int j  = 0; j<A.size(); j++){
            int sum = 0;
            for(int i = 0; i<A.get(j).size() ; i++){
                sum+= A.get(j).get(i);
            }
            ans.add(sum);
        }
return ans;

    }

}
