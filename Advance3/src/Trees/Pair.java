package Trees;

public class Pair<T, I extends Number> {


    TreeNode node;
    int level;

    Pair(TreeNode node  , int level){
        this.node = node;
        this.level = level;

    }

    public int getLevel(){
        return this.level;

    }

    public TreeNode getNode(){
        return this.node;
    }

}
