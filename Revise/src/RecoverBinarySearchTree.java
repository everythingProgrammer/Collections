import java.util.ArrayList;
import java.util.Stack;

public class RecoverBinarySearchTree {
    public static ArrayList<Integer> recoverTree(TreeNode A) {

            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = A;
            TreeNode prev =null;
            TreeNode first = null;
            TreeNode second = null;

            while( !stack.isEmpty() || (curr != null && curr.val !=-1)){

                while(curr!=null && curr.val != -1){

                    stack.push(curr);
                    curr= curr.left;
                }
                curr = stack.pop();
                if(prev == null){
                    prev = curr ;
                }else{
                    if(curr.val<prev.val){
                        // curr.val < prev = dip
                        if(first == null){
                            first = prev;
                            second = curr;
                        }else{
                            second = curr;
                        }
                    }
                }
                curr = curr.right;
            }
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(first.val<second.val ? first.val : second.val );
            ans.add(first.val<second.val ? second.val : first.val );
            return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(-1);
        root.right.right = new TreeNode(-1);

        recoverTree(root);

    }

}
