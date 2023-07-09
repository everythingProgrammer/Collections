import java.util.ArrayList;

public class Permutations {


    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        generatePermute(0,A,ans);
        return ans;
    }

    public static void generatePermute(int index , ArrayList<Integer> A, ArrayList<ArrayList<Integer>>ans){
        if( index == A.size()-1){
            ans.add(new ArrayList<>(A));
            return;
        }

        for(int j = index; j<A.size(); j++){
            /*
                Swap
             */
            int temp = A.get(index);
            A.add(index,A.get(j));
            A.remove(index+1);
            A.add(j,temp);
            A.remove(j+1);
            generatePermute(index+1,A,ans);
            temp = A.get(index);
            A.add(index,A.get(j));
            A.remove(index+1);
            A.add(j,temp);
            A.remove(j+1);

        }


    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        permute(list);
    }
}
