package BitManipulations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SingleNumber3 {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
         Collections.sort(A);
         System.out.println("Sorted List = "+A);
        int counter = 0 ^ A.get(0);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1  ; i<A.size(); i+=2){
            int temp  = A.get(i) ^ counter;
            if( (A.get(i) ^ A.get(i-1)) != 0){
                ans.add(A.get(i-1));
                counter = 0^ A.get(i);
            }
            else{
                counter = counter^A.get(i);
            }

        }
        return ans;
    }


    public static void findRightMostSetBit(int n){
        double position = 1 + Math.log(n & (~( n-1 )) )/Math.log(2);
        int pos = (int) (1 + Math.log(n & (~( n-1 )) )/Math.log(2) );
        System.out.println("ANS = "+pos);
        System.out.println("ANS = "+ (n & ~(n-1)));
        System.out.println("Right most set bit for " + n + " is : " + Integer.toBinaryString(n & ~(n-1)));
        System.out.println("Position: " + position);
    }

    public static  ArrayList<Integer> solve2(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();

        int xor = A.get(0) ;

        for(int  i = 1; i<A.size(); i++){
            xor = xor^A.get(i);
        }
        //Now we have XOR we need to find rightmost bit

        // Now we have right most bit in xor it can be 16,8,4,2,1
        xor = xor & (~(xor -1));

        // Group 1 elements will have  1 at same place as xor so will produce  xor  on AND ,
        // Group 2 elements will have  0 at same place as xor so will produce 0 on AND

        int x =0 ,y = 0;
        // We dont need starting values for XOR   because   A^0 = A
        for(int i  = 0 ; i<A.size(); i++){
           int  a = A.get(i);
            if( (a & xor) == 0 ){
                x= x^ a;
            }else{
                y  = y^a;
            }
        }
        ans.add(x<y?x:y);
        ans.add(y<x?x:y);

        return ans;

    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = 5;
//        ArrayList<Integer> a = new ArrayList<>();
//        for(int i = 0 ; i<n ; i++){
//            a.add(sr.nextInt());
//        }
//        System.out.println(solve(a));

        findRightMostSetBit(16);
    }
}
