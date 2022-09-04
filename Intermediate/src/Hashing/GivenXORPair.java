package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GivenXORPair {
    public int solve(ArrayList<Integer> A, int B) {


        HashSet<Integer> hs = new HashSet<>();
        int count = 0;

        for(int i = 0;i<A.size();i++){

            if(hs.contains( (A.get(i) ^ B) )){
                count++;
            }
            hs.add(A.get(i));

        }
    return count;

    }
}
