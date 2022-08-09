package Arrays;

import java.util.ArrayList;

public class AlternatingSubarray {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        ArrayList<Integer> nums = new ArrayList<>();

        int subLength =  (2*B)+1;

        if(A.size()< subLength){
            return nums;
        }
        if(B==0){
            for(int i = 0 ; i<A.size(); i++){
                nums.add(i);
            }
            return nums;
        }


        for(int i = subLength/2; i< A.size()-(subLength/2); i++){

            int prev =  A.get( i-(subLength/2) );

            for(int j = i-(subLength/2) +1; j <=  i+ (subLength/2);j++){
                if(prev != A.get(j)){
                    prev = A.get(j);
                    if(j == i+(subLength/2) ){
                        nums.add(i);
                    }
                }
                else{
                    break;
                }
            }

        }
        return nums;

    }

    public static void main(String args[]){

    }


}
