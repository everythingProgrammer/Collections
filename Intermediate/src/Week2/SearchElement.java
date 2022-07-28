package Week2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        String ans = "";
        int T =  sr.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
        int nums[] ;
//        int B = 0;
        while(T-->0){
//            arr = new ArrayList<>();
            int A = sr.nextInt();
            nums = new int [A];
            for(int i = 0;i<A ; i++){
                nums[i] = sr.nextInt();
            }
            boolean found = false;
            int B = sr.nextInt();
            for(int i = 0 ;i<A; i++){
                if(nums[i] == B){
                    found= !found;
                    ans+="1\n";
                    break;
                }
            }
            if(found== false){
                ans+="0\n";
            }
        }
        System.out.println(ans);

    }

}
