package Trees;

public class LargestBinarySubtree {



        /*
                Wont work like this , cuz we cannot be sure about subtree just by looking at its root node ...
         */
    /*
    int globalMax = 0;
    public int solve(TreeNode A) {

        count(A);

        return this.globalMax;
    }

    public int count(TreeNode A){
        if( A == null){
            return 0;
        }
        int l =-1;
        int r =-1;
        if( (A.left!=null && A.left.val< A.val) || A.left == null ){
            l = count(A.left);
        }

        if( (A.right!=null && A.right.val> A.val) || A.right == null  ){
            r = count(A.right);
        }

        if(l == -1 && r > -1){
            this.globalMax = Math.max(this.globalMax, r+1);
        }else if(r == -1 && l > -1){
            this.globalMax = Math.max(this.globalMax, l+1);
        }
        else if(r > -1 &&  l > -1){
            this.globalMax = Math.max(this.globalMax, l+r+1);
        }

        if(l>-1 && r > -1)
            return l+r+1;
        return -1;
    }
    */

    /*
        This is correct approach , but calling count() function only on root won't return correct answer, because as soon a we see a node doesn't
        contribute to BST then we are returning -1 , but the largest BST could be there in the depths of this node ...

        Also I tried shifting the checking part , i.e.  current is less than minimum / or current is greater than max to last but that didn't helped
        either , (do a dry run )

     */
    /*
    int globalMax = 0;
    public int solve(TreeNode A) {
        count(A, Integer.MIN_VALUE , Integer.MAX_VALUE);
        return this.globalMax;
    }

    public int count(TreeNode node , int minLimit , int maxLimit){
        // if node is zero return 0
        if(node == null){
            return 0;
        }

        // if node is not null then check if it is eligible BST subtree
        if( node.val >minLimit || node.val < maxLimit ){
            return -1;
        }

        int l = count(node.left , minLimit  , node.val-1);
        int r = count (node.right , node.val+1, maxLimit );

        if(l > -1){
            globalMax = Math.max(globalMax, l+1);
        }
        if( r> -1){
            globalMax = Math.max(globalMax , r+1);
        }
        if(l != -1 && r != -1){
            globalMax  = Math.max(globalMax, l+r+1);
            return l+r+1;
        }else{
            return -1;
        }
    }
     */

    /*
        Using the Same approach of having minimum and maximum passed through , but recursively on all the nodes present
        Effective Time Complexity will be in Order of O(n^2)
     */

    public int globalMax=0;
    public void caller(TreeNode A){
        if(A==null)
            return;
        count(A, Integer.MIN_VALUE , Integer.MAX_VALUE);
        caller(A.left);
        caller(A.right);
    }
    public int solve(TreeNode A) {
        caller(A);
        return this.globalMax;
    }
    public int count(TreeNode node , int minLimit , int maxLimit){
        // if node is zero return 0
        if(node == null){
            return 0;
        }
        // if node is not null then check if it is eligible BST subtree
        if( node.val < minLimit || node.val > maxLimit ){
            return -1;
        }
        int l = count(node.left , minLimit  , node.val-1);
        int r = count (node.right , node.val+1, maxLimit );
        if(l != -1 && r != -1){
            this.globalMax  = Math.max(this.globalMax, l+r+1);
            return l+r+1;
        }
        return -1;
    }

}
