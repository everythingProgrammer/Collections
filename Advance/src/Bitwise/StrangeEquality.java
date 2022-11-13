package Bitwise;

public class StrangeEquality {
    public static int solve(int A) {

        int min = 0;
        int acopy = A;
        for(int i = 0; acopy>0 ; i++){
            int bit = 1<<i;
            if((acopy &1) == 0){
                min = min|bit;
            }
            acopy = acopy>>1;
        }

        int max = 0;
        int bcopy = A;
        int j = 0;
// Find the leftmost set bit for A
        int leftmostBit = 0;
        for(j = 0 ; j<31; j++){

            if( (bcopy & (1<<j)) >1 ){
                leftmostBit = j;
            }

        }
       leftmostBit = leftmostBit+1;
        max = max | 1<<leftmostBit;
        return min^max;
    }
    public int optimal(int A) {
        int bit = 0, x = 0;
        while (A != 0) {
            if (A % 2 == 0) {
                x = x | (1 << bit);
            }
            A /= 2;
            bit++;
        }
        int y = (1 << bit);
        return x ^ y;
    }
    public static void main(String[] args) {
        solve(1);
    }


}
