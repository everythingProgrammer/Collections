package BitManipulations;

import java.util.ArrayList;
import java.util.Scanner;

public class BitwiseOr {
    public static  Long solve(int A, ArrayList<Integer> B) {

        /*
            Going to check for only 0's

            Then Total Subarrays - Subarrays containing only zero'es

         */
        long count = 0 ; // To count number of subarrays with only '0'

        long subsCount = 0;
        for(int i = 0 ; i<A; i++){

            if(B.get(i) == 0){
                subsCount ++;
            }
            else{
                count += ( subsCount* (subsCount+1))/2;
                subsCount = 0;
            }
        }
        count += (subsCount* (subsCount+1))/2;
        long total = ( A * (A+1))/2;   /* Here    total will be wrong why? cuz A is integer with max range 10^5 , when A*A integer Multiplication will happen and bazinga out of range , lossy conversion   */
        return total - count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        for(int i = 0 ; i<n ; i++){
            A.add(sr.nextInt());
        }
        System.out.println(solve(n,A));



    }

}
