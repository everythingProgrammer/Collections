package BinarySearch;

public class SquareRootOfInteger {

    public int sqrt(int A) {
        int l = 1;
        int r = A;
        while(l<=r){
            int mid = (l+r)/2;

            if(mid*mid == A){
                return mid;
            }else if( mid*mid >A){
                r = mid-1;
            }else if(mid*mid<A){
                l = mid+1;
            }

        }
        return 0;

    }


    public static void main(String args[]){

    }


}
