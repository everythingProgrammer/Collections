package BinarySearch;

import java.util.ArrayList;

public class FindAPeakElement {

    public static int solve(ArrayList<Integer> A) {


        int l = 0;
        int r = A.size()-1;
        int ans = 0;

        if(A.size() == 1){
            return A.get(0);
        }

        if(A.get(0) > A.get(1)){
            return A.get(0);
        }
        else if(A.get(A.size()-1) > A.get(A.size()-2) ){
            return A.get(A.size()-1);
        }

        while(l<=r ){
            int mid =  (l+r)/2;
            int num = A.get(mid);

            if(num >= A.get(mid-1) && num>= A.get(mid+1)){
                // this is answer
                return num;
            }
            if( A.get(mid-1)>num && A.get(mid+1)>num ){
                // here  mid is in middle of two elements greater than itself , so going right
                l = mid+1;
            }
            else if ( A.get(mid-1)> num && A.get(mid+1)<=num){
                // here we see a downward slope so we go towards peak , i.e. left
                r = mid-1;
            }
            else if( A.get(mid-1)<=num && num < A.get(mid+1)){
                // here we see a / slope so we go towards peak , i.e. right
                l = mid+1;
            }


        }
        return 0;

    }

    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);
//        list.add(110);
        System.out.println(solve(list));
    }
}
