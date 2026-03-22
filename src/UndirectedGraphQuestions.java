import java.util.*;

public class UndirectedGraphQuestions {
    class Pair {
        int node, parent;
        Pair(int n, int p) {
            node = n;
            parent = p;
        }
    }

    // DFS function signature
    // DFS Iterative
    public void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        int startingNode = node;

        Stack<Integer> stack = new Stack<>();
        stack.push(startingNode);

        while(!stack.isEmpty()){
            int current = stack.pop();
            if(visited[current]){
                continue;
            }
            visited[current] = true;
            System.out.print(current+" ");
            for( int vertex: graph.get(current)){
                if(visited[vertex]!= true)
                 stack.push(vertex);

            }
        }

    }


    // cycle detection using iterative DFS and Pair to track parents
    boolean hasCycle(int n, List<List<Integer>> graph) {
        boolean []visited = new boolean[n];
        for(int i = 0 ; i<n ; i++ ){
            // Loop and check for loosely connected graph components
            if(!visited[i]){
                Stack<Pair> stack = new Stack<>();
                stack.push(new Pair(i,-1));

                while(!stack.isEmpty()){
                    Pair curr = stack.pop();
                    int currNode = curr.node;
                    int parent = curr.parent;
                    if(visited[currNode]){
                        continue;
                    }
                    visited[currNode] = true;
                    for ( int nbrs : graph.get(currNode)){
                        if(!visited[nbrs]){
                            stack.push(new Pair(nbrs,currNode));
                        }else if (nbrs!=parent){
//                            System.out.println(nbrs+" - " +currNode+" - "+parent);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }







    public void bfs(int start, List<List<Integer>>graph){
        Queue<Integer> q =new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        q.offer(start);
        visited[start] = true;


        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+" ");
            for(int nbrs: graph.get(node)){
                if (!visited[nbrs]){
                    visited[nbrs] = true;
                    q.offer(nbrs);
                }
            }

        }

    }

    public boolean isBipartite(int n , List<List<Integer>> graph){
        int []color = new int[graph.size()];

        for(int i = 0 ; i<color.length; i++)
            color[i] = -1;

        Queue<Integer> q = new LinkedList<>();

        q.offer(n);
        color[n] = 0;

        while(!q.isEmpty()){


            int node = q.poll();

            for(int nei: graph.get(node)){
                if(color[nei] == -1){
                    color[nei] = 1-color[node];
                    q.offer(nei);

                }else{
                    if(color[nei]== color[node]){
                        return false;
                    }
                }
            }

        }
        return true;
    }



    public boolean isBipartiteDfs(int n , List<List<Integer>> graph){

        int []color = new int[graph.size()];
        Arrays.fill(color,-1);

        for(int i = 0 ; i<graph.size(); i++){

            if(color[i]!=-1){
                continue;
            }

            Stack<Integer> s = new Stack<>();

            s.push(i);
            color[i] = 1;

            while(!s.isEmpty()){

                int node = s.pop() ;

                for(int nei: graph.get(node)){
                    if(color[nei] ==-1){
                        color[nei] = 1-color[node];
                        s.push(nei);
                    }else if (color[nei] == color[node]){
                        return false;
                    }
                }

            }

        }
        return true;
    }

    public boolean isBipartiteDfsR(int node, int color[] , List<List<Integer>>graph){

        for(int nei: graph.get(node)){
            if(color[nei] ==-1){
                color[nei] = 1-color[node];
                if(!isBipartiteDfsR(nei,color,graph)){
                    return false;
                }
            }else if (color[nei] == color[node]){
                return false;
            }
        }
        return true;


    }

    // IN above code the node color needs to be set before calling the function

    public boolean isBipartiteDfsRPerfect ( int node  , int c , int color[] , List<List<Integer>> graph){

        color[node] = c;

        for(int nei: graph.get(node)){
            if(color[nei] == -1){

                if(!isBipartiteDfsRPerfect(nei,1-c,color,graph)){
                    return false;
                }
            }else if (color[nei] == color[node]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        // Constructing the graph
        int numVertices = 7; // Example: 0 to 6
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges (undirected)
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 5);
//        addEdge(adj, 4, 5);
        addEdge(adj,4,6);
        addEdge(adj,6,0);


        UndirectedGraphQuestions gq = new UndirectedGraphQuestions();
        boolean[] visited = new boolean[numVertices];
        
        System.out.println("DFS traversal starting from node 0:");
        gq.dfs(0, adj, visited);
        System.out.println("BFS traversal starting from node 0:");
        gq.bfs(0,adj);
        System.out.println();
        if(gq.hasCycle(7,adj)){

            System.out.println("Cycle Detected");
        }else{
            System.out.println("No Cycle Detected");
        }


    }

    // Helper to add undirected edge
    private static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }







}