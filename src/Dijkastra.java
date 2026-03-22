import java.util.List;
import java.util.PriorityQueue;
import java.util.*;
public class Dijkastra {




    public static int[] dijkastra(List<List<int[]>>graph , int src ,int n){

        // int distance[]
        // Min Heap

        int [] distance = new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b)->a[1]-b[1]);
        pq.offer(new int[]{src,0});
        distance[src] = 0;


        while(!pq.isEmpty()){

            int[] curr = pq.poll();
            int node = curr[0];
            int weight = curr[1];

            if(distance[node] < weight){
                continue;
            }


            for( int[] nbrs: graph.get(node)){
                int nextNode = nbrs[0];
                int nextNodeWeight = nbrs[1];

                if( weight+nextNodeWeight < distance[nextNode]){
                    distance[nextNode] = (weight+nextNodeWeight);
                    pq.offer(new int[ ]{nextNode, distance[nextNode]});
                }

            }

        }

        return distance;

    }


    public static void main(String args[]){
        int n = 4;
        int k = 2;
        int times[][] =   {{2,1,1},{2,3,1},{3,4,1}};



        List<List<int[]>> graph = new ArrayList<>();

        for(int i = 0 ; i<=n ; i++) graph.add(new ArrayList<>());
        for(int i  = 0 ; i<times.length; i++){
            int[] conn = times[i];
            int u = conn[0];
            int v = conn[1];
            int w = conn[2];

            graph.get(u).add(new int[]{v,w});

        }

        System.out.println(dijkastra2(graph,k,n));

    }
    public static int dijkastra2(List<List<int[]>> graph, int source , int n){
        int distance[] = new int[n+1];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0]  = -1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));

        pq.offer(new int[]{source,0});
        distance[source] = 0;

        while(!pq.isEmpty()){
            int curr[]  = pq.poll();
            int node= curr[0];
            int weight = curr[1];

            if(weight>distance[node]) continue;

            for(  int nei[]:  graph.get(node)  ){
                int nextNode = nei[0];
                int nextWeight = nei[1];
                int nextJump = nextWeight+weight;
                if(nextJump < distance[nextNode]){
                    distance[nextNode] = nextJump;
                    pq.offer(new int[]{nextNode, nextJump});
                }
            }

        }
        int maxWeight = 0;
        for(int curr_weight: distance){
            maxWeight = Math.max(maxWeight,curr_weight);
        }
        return maxWeight==Integer.MAX_VALUE?-1:maxWeight ;
    }

}
