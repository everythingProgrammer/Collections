package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;




public class VerticalOrderTraversal {

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        HashMap<Integer , ArrayList<Integer>> Order = new HashMap<>();

        Queue<Pair<TreeNode,Integer>> queue = new LinkedList<>();

        queue.add(new Pair(A, 0));
        int minLevel = 0;
        int maxLevel  = 0;
        while(!queue.isEmpty()){

            Pair curr = queue.peek();

            if(curr.getNode().left != null){
                queue.add(new Pair(curr.getNode().left , curr.level-1));
            }
            if(curr.getNode().right!= null){
                queue.add(new Pair(curr.getNode().right , curr.level+1));
            }


            int currLevel = curr.getLevel();
            TreeNode currNode = curr.getNode();
            minLevel = Math.min(minLevel, currLevel );
            maxLevel = Math.max(maxLevel , currLevel );

            ArrayList<Integer> prevList = Order.getOrDefault(currLevel , new ArrayList<>());
            prevList.add(currNode.val);
            Order.put(currLevel, prevList)  ;
            queue.poll();
        }

        for(int i = minLevel; i<= maxLevel; i++){
            ans.add(Order.get(i));
        }


        return ans;

    }
}
