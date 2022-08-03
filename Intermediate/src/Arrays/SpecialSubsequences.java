package Arrays;

public class SpecialSubsequences {
    public int solve(String A) {

        long M = 1000000007;
        long count = 0L;
        long countA = 0L;
        for(int i = 0 ; i<A.length(); i++){
            if(A.charAt(i) == 'A'){
                countA++;
            }
            else if(A.charAt(i) == 'G'){
                count += countA;
            }
        }
        return (int) (  count%M);

    }
}
