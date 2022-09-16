package Trees;

public class CountingTheNodes {

    int count = 0;
    public void countNodes(TreeNode parent , int largestParent){
        if(parent == null){
            return;
        }

        if(parent.val>largestParent){
            count++;
        }
        countNodes(parent.left,largestParent>parent.val?largestParent:parent.val);
        countNodes(parent.right,largestParent>parent.val?largestParent:parent.val);
        return;
    }

    public int solve(TreeNode A) {

        countNodes(A,0);
        return count;

    }



}
