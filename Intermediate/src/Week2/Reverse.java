package Week2;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public ArrayList<Integer> solve(final List<Integer> A) {

        ArrayList<Integer>rs = new ArrayList<>();
        for(int i = A.size()-1; i>=0; i--){
            rs.add(A.get(i));
        }
        return rs;
    }

}
