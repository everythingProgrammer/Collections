package Arrays;

import java.util.ArrayList;

public class FirstMissingNaturalNumber {

// inplace swap
    public static int firstMissingPositive(ArrayList<Integer> A) {


        for(int i = 0 ; i<A.size(); ){
            int n = A.get(i);

            if(n-1< A.size() && n-1>=0 && A.get(n-1)!= n){
                int temp = A.get(n-1);
                A.set(n-1,n);
                A.set(i,temp);
            }else{
                i++;
            }
        }

        for(int i = 0 ; i<A.size(); i++){
            if(A.get(i) != i+1){
                return i+1;
            }
        }
        return A.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        System.out.println(firstMissingPositive(nums));
    }


}
