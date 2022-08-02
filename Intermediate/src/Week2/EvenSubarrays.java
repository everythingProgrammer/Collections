package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenSubarrays {


    /*
     * So if length is odd then it's not possible to divide into subarrays with even length
     * If EvenLength
     *      If array start or end Index is odd then ,  cannot start subarray/ end subarray ... so 'NO'
     *
     *      Now in array we just have to find 1 even Index i  for which    nums[i] == even and nums[i+1]  == even
     *
     *
     */

    public static String solve(ArrayList<Integer> A) {
        int n = A.size();
        if((n|1) == n){
            return "NO";
        }
        int first = A.get(0);
        int last = A.get(n-1);
        if((first|1) == first || (last|1)==last){
            return "NO";
        }

        for(int i = 1; i<n-1; i++){
            if((i|1) == i){
                System.out.println("i = "+i+ " nums[i]= "+A.get(i));
                int num = A.get(i);
                int num2 = A.get(i+1);
                if( (num|1) > num && (num2|1) > num2 ){
                    return "YES";
                }
            }
        }
        return "NO";

    }

    public static void main(String[] args) {

//        int[] nums = {2,4,8,6};;

        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(2);
//        nums.add(4);
//        nums.add(8);
//        nums.add(7);
//        nums.add(6);

        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        for(int i = 0; i<N ; i++){
            nums.add(sr.nextInt());
        }

        System.out.println(solve(nums));

    }

}
