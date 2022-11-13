package Sort;

import java.util.ArrayList;

public class ArrayWithConsecutive {
    public static int solve(ArrayList<Integer> A) {


        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i<A.size(); i++){
            sum = sum+ A.get(i);
            if(A.get(i)<min){
                min  = A.get(i);
            }
            if(A.get(i)>max){
                max  = A.get(i);
            }
        }

        int expected = (int) ( ((A.size())/2.0)* ( (2*min) + (A.size()-1)*1  ));

        if(expected == sum){
            return 1;
        }else{
            return 0;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        System.out.println(solve(ans));
    }

}
