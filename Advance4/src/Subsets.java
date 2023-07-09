import java.util.ArrayList;
import java.util.Collections;

public class Subsets {

    /*
            This is also correct , but the result isn't sorted lexicographically
     */
    /*
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        Collections.sort(A);
        createSubset(0,new ArrayList<>() , ans,A);
        return ans;

    }

    public void createSubset(int index , ArrayList<Integer> currentList, ArrayList<ArrayList<Integer>>ansList, ArrayList<Integer>A){

        if(index == A.size()){
            if(currentList.size()>0)
               ansList.add(currentList);
            return;
        }
        createSubset(index+1,new ArrayList<>(currentList),ansList,A);
        currentList.add(A.get(index));
        createSubset(index+1 , new ArrayList<>(currentList),ansList,A);



    }

     */

    ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        findSubsets(A, new ArrayList<Integer>(), 0);
        return finalAns;
    }

    public void findSubsets(ArrayList<Integer> A, ArrayList<Integer> temp, int index) {
        finalAns.add(new ArrayList<>(temp));

        for (int i = index; i < A.size(); i++) {
            temp.add(A.get(i));
            findSubsets(A, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
        return;
    }

}
