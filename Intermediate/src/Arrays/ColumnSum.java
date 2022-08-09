package Arrays;

import java.util.ArrayList;

public class ColumnSum {


    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int j = 0 ; j<A.get(0).size(); j++){
            int sum = 0;
            for(int i = 0;i<A.size(); i++){
                sum+= A.get(i).get(j);
            }
            ans.add(sum);
        }
        return ans;
    }


}
