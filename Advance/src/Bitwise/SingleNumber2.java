package Bitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber2 {
    public static int singleNumber(final List<Integer> A) {
        int num = 1;
        int ans = 0;
        for(int i = 0 ; i<=31 ; i ++){
            int count = 0;
            for(int j = 0 ; j<A.size() ; j++){
//                System.out.println("num = "+num + " A.get(j) = "+A.get(j)+", num&A.get(j) "+ (num& A.get(j)));

//                if(  (num & A.get(j)) >= 1){
                /*
                    This codintion is extremely important for  -ve values
                    because  most significant bit will be always -ve
                    and its    '&' with num will result in -ve value as well ...
                 */
                if(  (num & A.get(j)) != 0){
                    count++;
                }
            }
//            System.out.println("****************************************************************");
            if( count%3 == 1){
                ans  = ans | num;
            }
            num = num<<1;
        }
        return ans;
    }

    public static void main(String[] args) {
//        int arr[] = {-2,-2,1,1,4,1,4,4,-4,-2};
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        for(int i = 0 ; i<n ; i++){
            nums.add(sr.nextInt());
        }
        System.out.println(singleNumber(nums ) );
    }
}
