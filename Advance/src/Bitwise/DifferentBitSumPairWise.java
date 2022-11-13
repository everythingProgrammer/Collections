package Bitwise;

import java.util.ArrayList;


// This problem is also know as hamming distance
public class DifferentBitSumPairWise {



    public static int cntBits(ArrayList<Integer> A) {

        // Gotta check how many pairs can be formed at every bit position
        // So count 1's and 0's at every length and multiply them to get the score at every bit level
        // sum it up for all 32 bits and we are good to go.
        // return the sum of difference


        long sum = 0 ;
        int n = 1;
        for(int i = 0  ; i<32  ; i++){
            int count0 = 0;
            int count1 = 0;

            for(int j = 0 ; j<A.size() ; j++){
                if((A.get(j) & n) >= 1){
                    count1 ++;
                }else {
                    count0++;
                }

            }
            sum = (sum + (count0 * count1)%1000000007)%1000000007;
            n= n<<1;
        }
        return (int) (2*sum)%1000000007;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(3);
        ans.add(5);
        System.out.println(cntBits(ans));
    }

}
