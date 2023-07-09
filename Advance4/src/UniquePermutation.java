import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UniquePermutation {

    public  static  ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {


        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        permutations(A,0,set);

        for (ArrayList<Integer> list : set) {
            ans.add(list);
        }

        return ans;

    }
    public static void permutations(ArrayList<Integer> A, int index , HashSet<ArrayList<Integer>> set){
        if(index == A.size()-1){
            set.add(new ArrayList<>(A));
            return;
        }

        for(int j = index ; j<A.size() ; j++){

            int temp = A.get(index);
            A.add(index,A.get(j));
            A.remove(index+1);
            A.add(j,temp);
            A.remove(j+1);
            permutations(A,index+1,set);
            temp = A.get(index);
            A.add(index,A.get(j));
            A.remove(index+1);
            A.add(j,temp);
            A.remove(j+1);
        }
    }



    /*
            Intended Way
     */
    public ArrayList<ArrayList<Integer>> permute2(ArrayList<Integer> A) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<A.size();i++){
            if(map.containsKey(A.get(i))){
                map.put(A.get(i),map.get(A.get(i))+1);
            }else{
                map.put(A.get(i),1);
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        permutation(map,new ArrayList<>() , A, ans);

    }
    public static void permutation(HashMap<Integer,Integer> map , ArrayList<Integer> list , ArrayList<Integer>A, ArrayList<ArrayList<Integer>>ans){

        if(list.size() == A.size()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i: map.keySet()){
            if(map.get(i) == 0){
                continue;
            }
            map.put(i,map.get(i)-1);
            list.add(i);
            permutation(map,list,A,ans);
            list.remove(list.size()-1);
            map.put(i,map.get(i)+1);
        }
        return;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        permute(list);
    }
}
