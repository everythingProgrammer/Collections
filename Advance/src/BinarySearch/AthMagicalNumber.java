package BinarySearch;

public class AthMagicalNumber {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    public int solve(int A, int B, int C) {

        long l = 1;
        long r = A* Math.min(B,C)*1L;

        long mid = 0;
        long ans = 0;
        long lc = lcm(B,C);

        while(l<=r){

            mid =  l + (r-l)/2;

            int N = (int)  (mid/B + mid/C - mid/ lc) ;

            if(N == A){
                ans = mid;
                r = mid-1;
            }else if(N<A){
                l = mid+1;
            }else if(N>A){
                r  = mid-1;
            }
        }
        return (int) (ans%1000000007);
    }

}
