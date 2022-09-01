package Hashing;

import java.util.HashSet;
import java.util.List;

public class DiffK {

    // not working
    public int diffPossible(final List<Integer> A, int B) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0 ; i<A.size() ; i++){
            int num = A.get(i);
            if(num>B){
                continue;
            }
            if(hs.contains( num )){
                return 1;
            }
            hs.add( num-B  );

        }
        return 0;
    }



    //   working
    public int diffPossible2(final List<Integer> A, int B) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0 ; i<A.size() ; i++){
            int num = A.get(i);
            if(num - B <=0){
                if(hs.contains(num + B)){
                    return 1;
                }
            }else if (num - B >0){
                if(hs.contains(num-B)|| hs.contains(num + B)){
                    return 1;
                }
            }


            hs.add(Math.abs(num)  );

        }
        return 0;
    }

    // not working
    //won't work either
    public int diffPossible3(final List<Integer> A, int B) {
        HashSet<Integer> hs = new HashSet<>();


        for(int i = 0 ; i<A.size(); i++){
            hs.add(A.get(i));
        }
        for(int i = 0 ; i<A.size(); i++){
            if(A.get(i) >B){
                if(hs.contains( A.get(i) - B )){
                    return 1;
                }
            }
        }
        return 0;
    }

}
