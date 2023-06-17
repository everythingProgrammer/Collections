import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {


    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> order = new ArrayList<>();


        Stack<TreeNode> s = new Stack<>();

        TreeNode curr = root;


        while(curr!=null && !s.isEmpty()){

            while(curr!=null){

                s.push(curr);
                order.add(curr.val);
                curr = curr.left;

            }
            curr = s.pop();
            curr = curr.right;

        }

        return order;

    }
}
