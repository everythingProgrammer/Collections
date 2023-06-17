import java.sql.Array;
import java.util.ArrayList;

public class SubarrayWithGivenSum {

    /* TC */
    public ArrayList<Integer> solve1(ArrayList<Integer> A, int B) {

        int starting = -1;
        int end = -1;

        for(int i = 0 ; i<A.size(); i++){
            if(starting !=-1) break;
            for(int j = i; j<A.size(); j++){
                int sum = 0;
                for(int t = i ; t<=j ; t++){
                    sum = sum+A.get(t);

                }
                if(sum==B){
                    starting=i;
                    end = j;
                    break;
                }
            }
        }
        if(starting == -1){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;

        }

        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = starting;i<=end ;i++){
            ans.add(A.get(i));
        }
        return  ans;

    }


    /*
        TC O(N)
        SC O(N)
     */
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B){

        ArrayList<Integer> pfSum = new ArrayList<>();
        pfSum.add(0);
        pfSum.add( A.get(0) );
        for(int i = 1 ; i<A.size(); i++){
            pfSum.add(pfSum.get(i) + A.get(i));
        }

        /*
                Now we have prefix sum
                Start i = 0 j = 1
                pf[j] - pf[i]
         */
        int i = 0;
        int j = 1;
//        int starting = -1;
//        int end = -1;
        while(j<pfSum.size() && i<pfSum.size()){
            if(pfSum.get(j)-pfSum.get(i) >B ){

                i++;

            }else if( pfSum.get(j) - pfSum.get(i) < B){
                j++;
            }else if(pfSum.get(j) - pfSum.get(i) == B){
                //i ++ here because   pf[j] - pf[i] signifies  pf[ i+1 -> j ] is our subarray
                break;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(i>=pfSum.size()|| j>=pfSum.size()){
            ans.add(-1);
        }
        else{
            for(;i<=j;i++){
                ans.add(A.get(i-1));
            }
            return ans;
        }
        return ans;
    }



}
