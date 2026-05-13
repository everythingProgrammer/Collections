package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MultipleTheories {


    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int currMax = Math.max(left,right) + 1;
        return currMax;
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> traversal = new ArrayList<>();

        queue.add(root);
        queue.add(null);

        ArrayList<Integer> children= new ArrayList<>();
        while(!queue.isEmpty()){

            TreeNode curr = queue.poll();

            if(curr == null){
                traversal .add(children);
                // this check
                if(queue.isEmpty()){
                    break;
                }

                children = new ArrayList<>();
                queue.add(null);
                continue;
            }
            if(curr.left!=null){
                queue.add(curr.left);

            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
            children.add(curr.val);

        }
        return traversal;
    }


    public List<List<Integer>> levelOrderBetter(TreeNode root){
        List<List<Integer>> traversal = new ArrayList<>();

        if(root == null){
            return traversal;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0 ; i<size ; i++){
                TreeNode curr = queue.poll();
                level.add(curr.val);

                if(curr.left!=null){
                    queue.offer(curr.left);

                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
            traversal.add(level);
        }
        return traversal;
    }


    public boolean isValidBST(TreeNode root) {

        return checkValidBST(Integer.MIN_VALUE,Integer.MAX_VALUE,root);



    }
    public boolean checkValidBST(int min , int max , TreeNode node){
        if(node == null){
            return true;
        }
        // if current node is valid
        if(node.val>max || node.val<=min){
            return false;
        }

        // add checking for subtrees
        boolean leftSubTree = checkValidBST(min,node.val,node.left);
        boolean rightSubTree = checkValidBST(node.val,max,node.right);

        return leftSubTree && rightSubTree;
    }


    int longestPath = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        recursiveCalculate(root);
        return longestPath;
    }

    public int recursiveCalculate(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftTree = recursiveCalculate(root.left);
        int rightTree = recursiveCalculate(root.right);

        longestPath = Math.max(leftTree+rightTree, longestPath);

        return Math.max(leftTree,rightTree)+1;


    }


    public int maxPathSum(TreeNode root) {

    }
}
