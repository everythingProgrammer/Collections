package Arrays;

import java.util.ArrayList;

public class MultipleLeftRotation {

    public static ArrayList<Integer> rotate(ArrayList<Integer> nums1, int rotations){


        ArrayList<Integer> nums = new ArrayList< >(nums1);
         rotations = rotations%nums.size();
         int indx = nums.size() -1-rotations;

         //reverse full
         int i = 0 ;
         int j = nums.size() -1;

        while(i<j){
            int temp = nums.get(i);
            nums.set(i,nums.get(j));
            nums.set(j,temp);
            i++;
            j--;
        }
         // reverse front till 0 indx
        i = 0;
        j = indx;
        while(i<j){
            int temp = nums.get(i);
            nums.set(i,nums.get(j));
            nums.set(j,temp);
            i++;
            j--;
        }
        //reverse rear from indx+1 to size()-1
        i= indx+1;
        j = nums.size()-1;
        while(i<j){
            int temp = nums.get(i);
            nums.set(i,nums.get(j));
            nums.set(j,temp);
            i++;
            j--;
        }

        return nums;

    }


    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i<B.size() ; i++){
            ans.add(rotate(A , B.get(i)) );
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
//        A.add(1);
//        A.add(2);
//        A.add(3);
//        A.add(4);
//        A.add(5);
        A.add(5);
        A.add(17);
        A.add(100);
        A.add(11);
        ArrayList<Integer> B  = new ArrayList<>();
        B.add(1);
//        B.add(3);
        System.out.println(solve(A,B));
    }



}
