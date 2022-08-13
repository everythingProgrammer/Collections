package BitManipulations;

import java.util.List;

public class SingleNumber {


    public int singleNumber(final List<Integer> A) {
        int repeat =A.get(0);
        for(int i =1; i<A.size(); i++){
            repeat = repeat^A.get(i);
    }
        return repeat;
}



}
