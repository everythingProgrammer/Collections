package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ColorfulNumber {



    public static int colorful(int A) {

        String temp = Integer.toString(A);
        int nums[] = new int[temp.length()];

        for(int i = 0;i< nums.length ; i++){
            nums[i] = Character.getNumericValue(temp.charAt(i));
        }
//        HashMap<Integer,Integer>
        HashSet<Integer>hs = new HashSet<>();
        for(int i=0;i<nums.length; i++){
            int multiple = 1;
            for(int j = i; j<nums.length ; j++){
                multiple = multiple*nums[j];

                if(hs.contains(multiple)){
                    return 0;
                }
                hs.add(multiple);
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        colorful(230);
    }


}
