package Arrays;

public class RainTrapping {

    public int trap(final int[] A) {

        int left[]  = new int[A.length];
        int right[] = new int[A.length];
        left[0] = A[0];
        right[A.length-1] = A[A.length-1];
        //calculating left
        for(int i = 1 ; i<A.length ; i++){
            left[i] = Math.max(A[i],left[i-1]);
        }
        //calculating right
        for(int j = A.length-2; j>=0; j--){
            right[j] = Math.max(A[j],right[j+1]);
        }
        int sum = 0;
        for(int i = 1; i<A.length -1; i++){
            sum+= Math.min(right[i],left[i])-A[i];
        }
        return sum;

    }

}
