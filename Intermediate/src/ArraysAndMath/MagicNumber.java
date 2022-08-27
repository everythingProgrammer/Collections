package ArraysAndMath;

public class MagicNumber {

    public static int solve(int A) {
        // need to check set bits one by one
        // we can right shift and check till number becomes zero
        int sum = 0;
        for(int i = 1 ; A>0 ; i++){

            if( (A&1) == 1){
                sum +=  Math.pow(5,i);
            }
            A = A>>1;
        }
        return sum;
    }

    public static void main(String[] args) {
        solve(3);
    }

}
