package DDArrays;

import java.util.ArrayList;

public class MatrixSame {


    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        int flag = 1;

        for(int i = 0 ; i< A.size(); i++){
            for(int j = 0;j<A.get(i).size(); j++){
                if(A.get(i).get(j) != B.get(i).get(j)){
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }

}
