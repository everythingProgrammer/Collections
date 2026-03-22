import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ImplicitGraphSolutions {

    public int numIslands(char[][] grid) {
        int island = 0;
        int rows = grid.length;
        int cols = grid[0].length;


        for(int r = 0;r<rows; r++){
            for(int c = 0; c<cols ; c++){
                if(grid[r][c] == '1'){
                    island++;
                    bfsnumIslands(grid,r,c,rows,cols);
                }
            }
        }
        return island;
    }


    private void bfsnumIslands(char[][] grid , int r , int c , int rows , int cols){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});
        grid[r][c] = 0;

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int[] point = q.poll();
            int row = point[0], col = point[1];
            for(int[]direction:directions){
                int nr = row+direction[0];
                int cr = col+direction[1];
                if(nr>=0 && nr< rows && cr >=0 && cr<cols && grid[nr][cr] == '1'){
                    q.add(new int[]{nr,cr});
                    grid[nr][cr] = '0';
                }
            }
        }



    }




    public void visit(char[][] grid, int i, int j ){
        if(i>= grid.length  || i<0|| j>= grid[i].length || j <0){
            return;
        }
        if(grid[i][j] == '0'){
            return ;
        }
        grid[i][j]  = '0';
        visit(grid,i+1,j);
        visit(grid, i-1,j);
        visit(grid,i,j+1);
        visit(grid,i,j-1);
    }


    public int numIslandsdfs(char[][] grid) {
        int count = 0;
        for(int i = 0 ; i < grid.length ; i++){

            for(int j = 0 ; j<grid[0].length; j++){
                if(grid[i][j] =='1'){

                    visit(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }



    public int[] findRedundantConnection(int edges[][]){

        // traverse of edges , keep adding to your graph
        // then send the graph and check if cycle appeared
        // if cycle appeared then return that pair of edge as answer


        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i<edges.length+1; i++){
            graph.add(new ArrayList<>());
        }


        for(int[] e:edges){
            int u = e[0];
            int v = e[1];
            boolean visited[] = new boolean[edges.length+1];
            if(hasPath(u,v,graph,visited)){
                return e;
            }else{
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
        }
        return new int[0];
    }

    public boolean hasPath(int source , int destination , List<List<Integer>> graph,boolean[] visited){
        visited[source]= true;
        if(source==destination){
            return true;
        }
        for(int nei:graph.get(source)){
            if(  !visited[nei] &&  hasPath(nei,destination,graph,visited)){
                return true;
            }
        }
        return false;
    }




    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return false;
    }
}
