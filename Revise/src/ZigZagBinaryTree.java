import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagBinaryTree {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        int order = 0; // if Order 0 then right to left
                        // if Order 1 then left to right
        queue.add(A);
        queue.add(null);
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(A.val);
        ans.add(lst);
        lst = new ArrayList<>();
        while(queue.size()>1){

            TreeNode curr = queue.poll();
            if(curr == null){
                queue.add(null);
                if(order == 1){
                    ans.add(lst);
                }else {
                    Collections.reverse(lst);
                    ans.add(lst);
                }
                order = 1-order;
                lst = new ArrayList<>();
                continue;
            }
            if(curr.left!=null && curr.left.val != -1){
                queue.add(curr.left);
                lst.add(curr.left.val);
            }
            if(curr.right!=null && curr.right.val != -1){
                queue.add(curr.right);
                lst.add(curr.right.val);
            }

        }

        return ans;

    }
}
