package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBinaryTree {

    public ArrayList<Integer> solve(TreeNode A) {

        Queue<TreeNode> q = new LinkedList<>();

        ArrayList<Integer> ans = new ArrayList<>();


        q.add(A);
        TreeNode curr = null;
        while(!q.isEmpty()){

            curr = q.poll();

            if(curr == null){
                ans.add(-1);
                continue;
            }else{
                ans.add(curr.val);
                q.add( curr.left != null? curr.left: null   );
                q.add( curr.right != null? curr.right: null   );
            }

        }
        return ans;

    }
}
