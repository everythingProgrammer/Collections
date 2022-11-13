package Bitwise;

import java.util.ArrayList;

public class CountTotalSetBits {


    public static  int solve(int A) {

        int count = 0 ;
        for(int num = 1; num<= A ; num++){
            int bit = 0;
            for(int i =0 ; i<32; i++ ){
                bit = 1<<i;
                if( (bit & num) !=0){
                    count++;
                }
            }
            count = count%1000000007;
        }
        return count;
    }

    public static  int solve2(int A) {
        /*
            Find out how many bits will be used.
         */
        int bitLen = 0;
        int copyA = A;
        while(copyA>0){
            bitLen++;
            copyA = copyA>>1;
        }
//        System.out.println(bitLen);
        // Now bitLen has the number of bits we have to calcu

        /*
        Now comes the part where we have to calculate how many 1's and 0's are will be in range of A.
         */
        long total_count = 0;
        for(int i = 0; i<=bitLen ; i++){

            long cell = 1L<<i+1;  // Cell is the count of  0's and 1's that make complete cycle

            // count the number of complete cycle
            long cycle  = (A+1) /cell;

            //add number of 1's in complete cycles
            //   no of 1's = cycle/2
            // every cycle contains equal number of 0's and 1's
            total_count += (cycle * (cell/2) )%1000000007;


            // now count extra 1's
            // need remainder for that
            long rem = (A+1)%cell;
            // now in this remainder first   cycle/2 elements will be zeroes
            rem = Math.max(0,  rem - (cell/2));
            // we have reused rem variable here ..


            total_count += rem;
            total_count = total_count%1000000007;
        }


    return (int) total_count;

    }





    public static void main(String[] args) {
       System.out.println( solve(4));
       System.out.println( solve2( 4));
    }

}
