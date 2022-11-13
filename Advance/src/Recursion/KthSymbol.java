package Recursion;

public class KthSymbol {


    public static int solve(int A, int B) {
      return rsolve(A,B-1); // This is done because  B index is done using 1 according to question
                                // but we are doing using 0 in our approach
    }
    public static  int rsolve(int A, int B) {
        // Ath row number and  Bth column

        if(B == 0){
            return 0;
        }

        int k =  rsolve(A-1,B/2);
    /*

        // if k returned is 0 then it will generate 01
        // if k returned is 1 then it will generate 10
        if(k==0){

            if((B&1) == 0){
                 return 0;
            }else
                return 1;

        }else {
            if( (B&1) == 0){
                return 1;
            }else {
                return 0;
            }
        }

    */
        /*
            Small optimization
         */

        if( (B&1) ==0 ){
            return k;
        }else{
            return 1-k;
        }

    }


    public static void main(String args[]){
//       System.out.println( solve(3,));

       for(int i = 1; i<=5 ;i++){
           int k = 1<<i-1;
           for(int j = 1; j<=k; j++){
               System.out.print(solve(i,j)+" ");
           }
           System.out.println();
       }

    }


}
