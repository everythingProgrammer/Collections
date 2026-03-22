import java.util.*;

public class Graph {

    // LeetCode style: Adjacency List using Map
    private Map<String, List<String>> adj = new HashMap<>();

    public void addEdge(String u, String v) {
        adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // Main DFS function
    public void dfs(String src) {
        Set<String> visited = new HashSet<>();
        dfsRecursive(src, visited);
    }

    // Helper function for DFS logic
    private void dfsRecursive(String current, Set<String> visited) {
        
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge("A", "B");
        g.addEdge("A", "D");
        g.addEdge("B", "C");
        g.addEdge("C", "D");
        g.addEdge("D", "E");
        g.addEdge("E", "F");
        g.addEdge("F", "G");
        g.addEdge("E", "G");

        System.out.println("Running DFS starting from A:");
        g.dfs("A");
    }
}