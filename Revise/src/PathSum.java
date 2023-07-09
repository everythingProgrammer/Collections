public class PathSum {


    public int hasPathSum(TreeNode A, int B) {


        return hasPath(A,B,0)>=1?1:0;
    }
    public int hasPath(TreeNode A, int B , int sum){

        // if leaf Node then check sum.
        if(A== null || A.val == -1){
            return 0;
        }
        if(A.left.val == -1  && A.right.val == -1){
            if( A.val + sum  == B){
                return 1;
            }
            else {
                return 0;
            }
        }

        int ans = hasPath(A.left , B , sum+A.val) + hasPath(A.right,B,sum+A.val);

        return ans;

    }
}
