package BitManipulations;

import java.util.ArrayList;

public class IntrestingArray {


    public String solve(ArrayList<Integer> A) {
        int sum = 0;
        for(int i = 0 ; i<A.size(); i++){
            sum+=A.get(i);
        }
        if((sum&1) == 0){
            return "Yes";
        }else{
            return "No";
        }
    }


    public static void main(String[] args) {

    }

}
