import java.util.ArrayList;
import java.util.HashMap;

public class NumberOfSquareFullArray {
    public static int solve(ArrayList<Integer> A) {


        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<A.size(); i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
            }else{
                map.put(A.get(i),1);
            }
        }
        // Get the list of all unique Permutations
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        permute(A,new ArrayList<>() , ans,map );

        int count = 0;
        for(ArrayList<Integer> lst: ans){
            if(squareFull(lst)){
                count++;
            }
        }
        return count;
    }

    public static boolean squareFull(ArrayList<Integer> lst){
        boolean flag = true;
        for(int i = 1 ; i<lst.size(); i++){
            flag = flag& perfectSquare(lst.get(i-1)+lst.get(i));
        }
        return flag;
    }


    public static boolean perfectSquare(long num){
        for(int  i = 1; i*i<= num; i++){
            if(i*i== num){
                return true;
            }
        }
        return false;
    }

    public static void permute(ArrayList<Integer> A , ArrayList<Integer> lst , ArrayList<ArrayList<Integer>>ans , HashMap<Integer,Integer>map){

        if(lst.size() == A.size()){
            ans.add(new ArrayList<>(lst));
            return;
        }

        for(int i: map.keySet()){
            if(map.get(i) == 0){
                 continue;
            }
            map.put(i,map.get(i)-1);
            lst.add(i);
            permute(A,lst,ans,map);
            lst.remove(lst.size()-1);
            map.put(i,map.get(i)+1);
        }
        return;


    }
    public static void main(String args[]){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(2);
        lst.add(2);
        solve(lst);
    }

}
