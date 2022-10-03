package Arrays.Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class SubMatrixSumQueries {
//    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {
//
//        /*
//            (B[i], C[i]) represents the top left corner of the i'th query.
//            (D[i], E[i]) represents the bottom right corner of the i'th query.
//         */
////        int ans = 0;
//        // first need to calculate  row = 0 and col = 0 sum
//        ArrayList<ArrayList<Integer>> psum = new ArrayList<>();
//
//        ArrayList<Integer> row = new ArrayList<>();
//        row.add(A.get(0).get(0));
//        for(int i = 1 ; i<A.get(0).size(); i++){
//            row.add(A.get(0).get(i) + row.get(i-1));
//        }
//        psum.add(row);
//        ArrayList<Integer> col = new ArrayList<>();
////        col.get(0).get(0);
//
//        for(int i = 1; i<A.size(); i++){
//            col.add(A.get(i ).get(0)+col.get(i-1) );
//        }
//        // putting these in our double dimensional
//
//        psum.add(row);
//        for(int i = 1; i<A.size(); i++){
//            ArrayList<Integer> temp = new ArrayList<>();
//            temp.add(col.get(i));
//            for(int j = 1; j<A.get(0).size(); j++){
//                temp.add(0);
//            }
//            psum.add(temp);
//        }
//        /*
//            Here we will have a double dimensional  ArrayList<>()
//         */
//
//        for(int i = 1; i<A.size() ; i++){
//            for(int j = 1 ; j<A.get(0).size(); j++){
//                psum.get(i).set(j, A.get(i-1).get(j) + A.get(i).get(j-1));
//            }
//        }
//        /*
//        Now we have our prefix sum array
//        We just need to process our requests now..
//         */
//
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i = 0 ; i<B.size(); i++){
//
//            int si = B.get(i)-1;
//            int sj = C.get(i)-1;
//
//            int ei = D.get(i)-1;
//            int ej = E.get(i)-1;
//
//
//
//            int rs = psum.get(ei).get(ej)-
//
//
//        }
//
//    }


    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        long prefixSum[][] = new long [A.length+1][A[0].length+1];

        for(int i = 0 ; i<A[0].length; i++){
            prefixSum[0][i] = 0;
        }
        for(int i = 0 ; i<A.length; i++){
            prefixSum[i][0] = 0;
        }

        for(int i =1 ; i<prefixSum.length; i++ ){
            for(int j = 1; j<prefixSum[i].length; j ++){
                prefixSum[i][j] = prefixSum[i][j-1] + A[i-1][j-1]; // remember A[][] works at index level
            }
        }


        for(int i = 2; i<prefixSum .length; i++){
            for(int j = 1; j<prefixSum[0].length; j++){
                prefixSum[i][j] = prefixSum[i ][j]+ prefixSum[i-1][j];
            }
        }


        /* Now prefix array also complete    */

        int ans[]  = new int[B.length];
        for(int i = 0 ; i<B.length ; i ++){
            int a1  = B[i] ;
            int b1  = C[i];
            int a2 = D[i];
            int b2 = E[i];

            long rs =   prefixSum[a2][b2] - prefixSum[a2][b1-1] - prefixSum[a1-1][b2]+ prefixSum[a1-1][b1-1];
            ans[i] = (int) ((rs%1000000007)+1000000007)%1000000007;

        }
return ans;


    }

    public static void main(String[] args) {
//        int B[] = {1, 2};
//        int C[] = {1, 2};
//        int D[] = {2, 3};
//        int E[] = {2, 3};
//        int nums[][] = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int B[] = {1, 1};
        int C[] = {1, 4 };
        int D[] = {2, 2};
        int E[] = {2, 4};
        int nums[][] = {
                {5,17,100,11},
                {0,0,2,8}
        };
        int ans[] = solve(nums,B,C,D,E);
        for(int a: ans){
            System.out.print(a+" ");
        }
//        System.out.println(solve(nums,B,C,D,E));
    }
}
