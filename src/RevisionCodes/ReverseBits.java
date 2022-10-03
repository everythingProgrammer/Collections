package RevisionCodes;

public class ReverseBits {

    public static long reverse(long A) {
        long num = 1L<<31;
        long ans = 0;
        for(int i = 0 ; i<32; i++){

            if((A&1) == 1){
                ans = ans|num;
            }
            num = num>>1;
            A = A>>1;

        }
        return ans;
    }


    public static long reverse2(long A) {
        long rev = 0;

        for(int i = 0 ; i<32; i++){

            rev<<=1;
            if( (A & (1<<i)) != 0){
                rev |=1;
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        long a = 1;
        System.out.println(1<<0);
        System.out.println(0<<1);
        System.out.println(1<<2);
        System.out.println(1<<3);
        System.out.println(1L<<31);

        reverse(3);
    }
}
