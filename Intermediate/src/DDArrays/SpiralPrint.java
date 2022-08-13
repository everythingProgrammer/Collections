package DDArrays;

import java.util.ArrayList;

public class SpiralPrint {



    public static  ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i<A ; i++){

            ans.add(new ArrayList<>());
        }

        int rb ,re , cb , ce ;
        rb = cb = 0;
        re = ce = A-1;
        int it = 1;
        for(int i = 1;ce>cb&& re>rb ; i++){
            // adding top row
            for(int k = rb ; k<=ce ; k++){
                ans.get(i-1).add(ans.get(i-1).size()-1>0?ans.get(i-1).size()-1:0,i);
                i++;
            }
            rb++;
            // adding rightmost column
            for(int k = it-1; k<=ce; k++ ){
                ans.get(k).add(ans.get(k).size()-1,i);
                i++;
            }
            ce--;
            // adding bottom row
            for(int k = ce ; k>=0; k--){
                ans.get(re).add(0,i);
                i++;
            }
            re--;
            // adding leftmost row

            for(int k = re; k>=0; re--){
                ans. get(re).add(it,i);
                i++;
            }
            it++;
            cb++;
        }

return ans;
    }
    public static void main(String args[]){

        int n = 5;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ans = generateMatrix(n);

        for(ArrayList<Integer> a: ans){
            System.out.println(a);
        }

    }

}
