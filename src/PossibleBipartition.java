import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.*;
public class PossibleBipartition {


    public boolean possibleBipartition(int n, int[][] dislikes) {


        List<List<Integer>> graph = new ArrayList<>();

        for(int i =0 ; i<= n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0  ; i<dislikes.length ; i++){
            graph.get(dislikes[i][0]).add(dislikes[i][1]);
            graph.get(dislikes[i][1]).add(dislikes[i][0]);
        }
        int visited[] = new int[n+1];
        Arrays.fill(visited,-1);


        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        visited[1] = 0;

        while(!q.isEmpty()){
            int num = q.poll();

            for(int nei: graph.get(num)){

                if(visited[nei]==-1){
                    q.offer(nei);
                    visited[nei] = 1-visited[num];
                }
                if(visited[nei] == visited[num]){
                    return false;
                }
            }

        }
        return true;
    }


    public static void main(String args[]){
        PossibleBipartition pb = new PossibleBipartition();
        int [][] dislikes = {{1,2},{1,3},{2,3}};

        pb.possibleBipartition(3,dislikes);


    }
}
