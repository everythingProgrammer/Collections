import java.util.*;

public class DirectedGraphQuestions {

    // DFS function signature
    public void dfs(int node, List<List<Integer>> adj, boolean[] visited) {

    }



    // cycle detection in directed unweighted graphs
    // recursive
    boolean directedHasCycle(int n, List<List<Integer>> graph, boolean visited[], boolean[] restack){
        visited[n] = true;
        restack[n] = true;

        for(int nei: graph.get(n)){

            if(!visited[nei]){
                if(directedHasCycle(nei,graph,visited,restack))
                    return true;
            }else if(restack[nei]){
                return true;
            }
        }
        restack[n] = false;
        return false;

    }
    // handles disconnected graph
    boolean hasCycleDirected(int node , List<List<Integer>>graph ){
        boolean []visited = new boolean [graph.size()];
        boolean []restack = new boolean [graph.size()];



        for(int i = 0 ; i<graph.size(); i++){
            if(!visited[i]){
                if(directedHasCycle(i,graph,visited,restack))
                    return true;
            }
        }

        return false;
    }



    void dfsTopoSort(int node , List<List<Integer>> graph, boolean [] visited,Stack<Integer> stack){

        visited[node] = true;

        for(int nei: graph.get(node)){
            if(!visited[nei]){
                dfsTopoSort(nei,graph,visited,stack);
            }
        }
        stack.push(node);
    }
    void TopoDfsDriver( List<List<Integer>> graph){

        boolean[] visited = new boolean[graph.size()];
        Stack<Integer>stack = new Stack<>();
        for(int i =0;i<graph.size(); i++  ){
            if(!visited[i]){
                dfsTopoSort(i,graph,visited,stack);
            }
        }

        List<Integer> result = new ArrayList<>();
        while(!stack.isEmpty()){

            result.add(  stack.pop() ) ;

        }
        System.out.println(result.toString());
    }



    void kahnAlgorithm(List<List<Integer>>graph){
        int [] indegree = new int[graph.size()];

        for(int i=0;i<graph.size(); i++){
            for(int nei: graph.get(i)){
                indegree[nei]++;
//                indegree[nei]=indegree[nei]+1;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i<graph.size(); i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }


        List<Integer> results = new ArrayList<>();

        while(!queue.isEmpty()){

            int node = queue.poll();
            results.add(node);

            // reduce the indegree of visitable components
            for(int nei: graph.get(node)){
                indegree[nei]--;
                // add the neighbour to queue if indegree becomes 0
                if(indegree[nei] == 0){
                    queue.offer(nei);
                }
            }

        }
        System.out.println("Kahn's Toposort = "+ results.toString());


        System.out.println();
    }



    public int minNumberOfSemesters(int numCourses, int[][] relations, int k) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses + 1];

        for (int[] relation : relations) {
            // Courses are 1-based, so relation[0] is prereq for relation[1]
            graph.get(relation[0]).add(relation[1]);
            indegree[relation[1]]++;
        }

        // Queue for courses with no prerequisites
        Queue<Integer> availableCourses = new LinkedList<>();
        for (int i = 1; i <= numCourses; i++) {
            if (indegree[i] == 0) {
                availableCourses.offer(i);
            }
        }

        int semesters = 0;
        int coursesTaken = 0;
        while (!availableCourses.isEmpty()) {
            semesters++;
            // In one semester, you can take up to 'k' of the available courses.
            int coursesToTake = Math.min(availableCourses.size(), k);
            List<Integer> coursesTakenThisSemester = new ArrayList<>();

            for (int i = 0; i < coursesToTake; i++) {
                int course = availableCourses.poll();
                coursesTakenThisSemester.add(course);
            }

            // For each course taken, update the indegree of its neighbors
            for (int course : coursesTakenThisSemester) {
                coursesTaken++;
                for (int neighbor : graph.get(course)) {
                    indegree[neighbor]--;
                    if (indegree[neighbor] == 0) {
                        availableCourses.offer(neighbor);
                    }
                }
            }
        }

        // If not all courses were taken, there must be a cycle.
        return coursesTaken == numCourses ? semesters : -1;
    }

    public static void main(String[] args) {
        // Constructing the graph
        int numVertices = 7; // Example: 0 to 6
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges (directed)
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 5);
        addEdge(adj, 5, 4);
        addEdge(adj, 4, 6);

        DirectedGraphQuestions gq = new DirectedGraphQuestions();

        System.out.println(" does graph has cycle ? "+gq.hasCycleDirected(0,adj));

        System.out.println(" DFS toposort ");
//        gq.TopoDfsDriver(adj);

//        gq.kahnAlgorithm(adj);




        int n = 4;
        int[][] relations = {{2, 1}, {3, 1}, {1, 4}};
        int k = 2;
        System.out.println("Minimum Semesters: " + gq.minNumberOfSemesters(n, relations, k));

        Kojasaraju.kosaraju(4, List.of(List.of()) );
    }

    // Helper to add directed edge
    private static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
}