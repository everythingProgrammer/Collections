package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        queue.add(null);
        ArrayList<Integer> list = new ArrayList<>();
        while(queue.size() > 1){
            TreeNode curr =queue.poll();
            if( curr == null){
                queue.add(null);
                ans.add(list);
                list = new ArrayList<>();
            }
            else{
                if(curr.left !=null && curr.left.val != -1){
                    queue.add(curr.left);
                }
                if(curr.right != null && curr.right.val != -1){
                    queue.add(curr.right);
                }
                list.add(curr.val);
            }
        }

        return ans;
    }
}
