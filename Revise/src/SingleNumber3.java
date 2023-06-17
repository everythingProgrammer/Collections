import java.util.ArrayList;
import java.util.Scanner;

public class SingleNumber3 {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        int xorofarray=A.get(0);
        for(int i = 1 ; i<A.size(); i++){
            xorofarray = xorofarray ^ A.get(i);
        }

        int firstsetbit =0;


        // Check and find rightmost set bit.
        for( int i = 0 ; i<32;i++){
            if( (xorofarray & (1<<i)) >0){
                firstsetbit = i;
                break;
            }
        }
        // Here I have the position of first set bit , to & it with something i need to 1<<firstsetbit


        int xor1 = 0;
        int xor2 = 0;
        // Now its time to divide input into two groups based on rightmost set bit
        int checkbit = 1<<firstsetbit;


        /*
            However there is an alternative to find the last set bit
            N ^ (~ (N-1))
         */


        for(int i = 0; i<A.size(); i++){
            if( ( (checkbit) & A.get(i)) > 0){
                xor1= xor1^A.get(i);
            }else{
                xor2= xor2^A.get(i);
            }
        }
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(xor1);
        nums.add(xor2);
        return nums;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String nums = sr.nextLine();
        String []num = nums.split(",");
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i = 0;i<num.length; i++){
            alist.add(Integer.parseInt(num[i]));
        }
//
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(1);
//        nums.add(5);
//        nums.add(5);
//        nums.add(3);
//        nums.add(2);
        solve(alist);
//        int nums[] = {2,1,2,3,4,1};
    }



    public static int[] singleNumber(int[] nums) {

        int xorArray = 0;
        for(int i = 0 ; i<nums.length; i++){
            xorArray = xorArray^nums[i];
        }

        int rightSetBit = xorArray & ( ~(xorArray-1));

        int ans[] = new int[2];

        for(int i =0;i<nums.length; i++){
            if((rightSetBit & nums[i]) > 0){
                ans[0] = ans[0] ^ nums[i];
            }else{
                ans[1] = ans[1]^nums[i];
            }
        }
        return ans;
    }
}
