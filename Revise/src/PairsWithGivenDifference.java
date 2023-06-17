import java.util.ArrayList;
import java.util.Collections;

public class PairsWithGivenDifference {


    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int j = 1;
        int i = 0;
        int count = 0;
        while(i<A.size() && j<A.size()){
            int sum = A.get(j)-A.get(i);
            if(sum> B){
                i++;
                if(i == j){
                    j++;
                }
            }else if( sum<B){
                j++;
            }else if (sum == B){
                int x=A.get(i) ;
                int y=A.get(j) ;
                while( (i<A.size()) && (A.get(i) == x) )
                {
                    i++;
                }
                while(j<A.size() && A.get(j)==y)
                {
                    j++ ;
                }
                count++;
            }
        }
        return count;
    }
}
