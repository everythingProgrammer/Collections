package Trees;

public class CountNodes {


    int count = 0;
    public void count(TreeNode A){
        if(A == null){
            return ;
        }
        count++;
        count(A.left);
        count(A.right);

    }

    public int count1(TreeNode A){

        if(A == null){
            return 0;
        }
        return count1(A.left)+count1(A.right)+1;


    }


    public int solve(TreeNode A) {
        count(A);
//        return count;

        return count1(A);
    }

}
