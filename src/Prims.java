import java.util.List;
import java.util.PriorityQueue;

public class Prims {


    // Uses visited[] , with Min Heap
    // Prim's uses Dijkstra like concept , of BFS
    //


    public int prims(int n , List<List<int[]>>graph){


        // [ node , weight ]
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a, b)->  a[1]-b[1]);
        boolean[] visited = new boolean[n];

        int mst = 0;
        int count_edges = 0 ;
        // added node 0 and weight also 0 ;
        pq.add(new int[]{0,0});

        while(!pq.isEmpty()){

            int curr_node [] = pq.poll();
            if(visited[curr_node[0]] ){
                continue;
            }
            mst+= curr_node[1];
            count_edges++;
            for(int [] nei: graph.get(curr_node[0])){
                if(!visited[nei[0]])
                    pq.offer(nei);
            }


        }
        if(count_edges == n){
            return mst;
        }else{
            return -1;
        }


    }

}
