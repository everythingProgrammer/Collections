import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.*;

public class Kojasaraju {





    public static List<List<Integer>>  kosaraju (int n , List<List<Integer>> graph){
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        // first go and take the order in stack
        for(int i = 0 ; i<n ; i++){
            if(!visited[i]){
                dfs1(i,graph,visited,stack);
            }
        }

        // Second step is to reverse the graph

        List<List<Integer>> revGraph = reverseGraph(n,graph);

        Arrays.fill(visited,false);

        // now we do dfs using nodes from the stack
        List<List<Integer>> result = new ArrayList<>();
        while(!stack.isEmpty()){
            int node = stack.pop();
            if(!visited[node]){
                List<Integer>component = new ArrayList<>();
                dfs2(node, revGraph,visited , component);
                result.add(component);
            }

        }
        return result;
    }



// normal dfs
    static void  dfs1(int node , List<List<Integer>> graph, boolean[] visited, Stack<Integer> stack){
        visited[node] = true;

        for(int nei: graph.get(node)){
            if(!visited[node]){
                dfs1(nei,graph, visited,stack);
            }
        }
        stack.push(node);
    }

    static List<List<Integer>> reverseGraph(int n , List<List<Integer>> graph){
        List<List<Integer>> rev = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            rev.add(new ArrayList<>());
        }
        for( int u = 0 ; u<n; u++){
            for(int v : graph.get(u)){
                rev.get(v).add(u);
            }
        }
        return rev;
    }

    static void dfs2(int node , List<List<Integer>>graph, boolean visited[] , List<Integer> component){

        visited[node] = true;
        component.add(node);
        for(int nei: graph.get(node)){
            if(!visited[nei]){
                dfs2(nei,graph,visited,component);
            }
        }


    }

}
