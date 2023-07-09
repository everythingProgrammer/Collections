import java.util.Stack;

public class IdenticalBinaryTree {
    public int isSameTree(TreeNode A, TreeNode B) {


        TreeNode currA = A;
        TreeNode currB = B;

        Stack <TreeNode> stackA = new Stack<>();
        Stack <TreeNode> stackB = new Stack<>();



        while ( !stackA.isEmpty()  || !stackB.isEmpty() || currA.val!=-1 || currB.val!=-1){


            while(currA.val!=-1){
                stackA.add(currA);
                currA = currA.left;
            }
            while(currB.val !=-1){
                stackB.add(currB);
                currB = currB.left;
            }

            // Here both the values will be null
            currA = stackA.pop();
            currB = stackB.pop();
            if(currA.val!=currB.val){
                return 0;
            }
            currA = currA.right;
            currB = currB.right;

        }
        return 1;
    }
}
