package BinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        int n = sr.nextInt();
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j<5 ; j++) {
                temp.add(sr.nextInt());
            }
            matrix.add(temp);
            temp = new ArrayList<>();
        }

        System.out.println(searchMatrix(matrix,94));
    }

    public static int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {

        /*
            First search and get the row
            so for the matrix, search will happen on 0th column
         */

        int l =0;
        int r =A.size()-1;
        int row = -1;

        if(A.size() > 1) {
            while (l <= r) {
                int mid = (r + l) / 2;

                if (A.get(mid).get(0) == B) {
                    return 1;
                } else if (A.get(mid).get(0) < B) {
                    row = mid;
                    l = mid + 1;
                } else if (A.get(mid).get(0) > B) {
                    r = mid - 1;
                }
            }
        }else{
            row = 0;
        }

        if(row == -1){
            return 0;
        }

        l = 0;
        r = A.get(row).size()-1;
        while(l<=r){
            int mid = (l+r)/2;

            if(A.get(row).get(mid) == B){
                return 1;
            }else if(A.get(row).get(mid) > B){
                //move left
                r = mid-1;
            }else if(A.get(row).get(mid)<B){
                //move right
                l = mid+1;
            }
        }
        return 0;

    }
}
