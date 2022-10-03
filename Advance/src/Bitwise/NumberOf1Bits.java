package Bitwise;

public class NumberOf1Bits {
    public int numSetBits(int A) {
        int count = 0;
        while( A>0 ){
            if((A&1) == 1)
                count++;
            A = A>>1;
        }
        return count;
    }
}
