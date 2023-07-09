import java.util.*;


class Pair<T, I extends Number> {


    TreeNode node;
    int level;

    Pair(TreeNode node  , int level){
        this.node = node;
        this.level = level;

    }

    public int getLevel(){
        return this.level;

    }

    public TreeNode getNode(){
        return this.node;
    }

}

public class TopView {


    public ArrayList<Integer> solve(TreeNode A) {

        HashMap<Integer,ArrayList<Integer>> map  = new HashMap<>();
        Queue<Pair<TreeNode,Integer>> queue = new LinkedList<>();
        int minlevel = Integer.MAX_VALUE;
        int maxlevel = Integer.MIN_VALUE;

        queue.add(new Pair(A,0));

        while(!queue.isEmpty()){

            Pair curr = queue.poll();

            if(map.containsKey(curr.level)){
                map.get(curr.level).add(curr.node.val);
            }else{
                ArrayList<Integer> lst = new ArrayList<>();
                lst .add(curr.node.val);
                map.put(curr.level,lst);
            }
            if(curr.node.left!= null){
                queue.add(new Pair(curr.node.left,curr.level-1));
            }
            if(curr.node.right !=null){
                queue.add(new Pair(curr.node.right , curr.level+1));
            }
            if(curr.level < minlevel){
                minlevel = curr.level;
            }
            if(curr.level>maxlevel){
                maxlevel = curr.level;
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =minlevel; i<=maxlevel;i++){
            list.add(map.get(i).get(0)) ;
        }
        return list;
    }



}
