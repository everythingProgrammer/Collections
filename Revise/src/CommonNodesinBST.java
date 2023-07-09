import java.util.HashSet;
import java.util.Stack;

public class CommonNodesinBST {


    public static int solve(TreeNode A, TreeNode B) {


        HashSet<Integer> hset = new HashSet<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = A;
        while(!stack.isEmpty() || (curr!= null && curr.val!= -1)){

            while(curr!=null&& curr.val!= -1){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            hset.add(curr.val);
            curr=curr.right;
        }

        // Now we have all the Elements of first tree in a HashSet
        // Now if we traverse over second tree and keep track with Hashset and add wherever required ..
        int sum = 0;
        stack = new Stack<>();
        curr = B;
        while(!stack.isEmpty() || (curr!= null && curr.val != -1)){
            while(curr!=null&& curr.val!= -1){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if(hset.contains(curr.val)){
                sum = (sum + curr.val ) %1000000007;
            }
            curr = curr.right;
        }
        return sum;

    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(-1);
        root.right.right = new TreeNode(-1);

        solve(root,root);

    }




    /*
        Using Simultaneous Inorder Traversal on both BST
     */

    public static int dualTraversal(TreeNode A, TreeNode B){

        return 1;


    }


}
