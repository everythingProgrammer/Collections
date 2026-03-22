import java.util.*;

public class Kruskal {






    // Kruskal uses DSU and Sorts the edges
    // Kruskal is great for sparse graph
    // TC is E LOG E


    // edges represent  node , neighbour , weight
     int kruskal(int n , int[][] edges){

         Arrays.sort(edges,(a,b)->a[2]-b[2]);

         DSU dsu = new DSU(n);

         int mstWeight = 0;
         int edgesUsed = 0;

         for( int [] edge: edges){
             int u = edge[0];
             int v = edge[1];
             int w = edge[2];

             if(dsu.find(u)==dsu.find(v)){
                 continue;
             }
             dsu.union(u,v);
             mstWeight += w;
             edgesUsed ++;

             if(edgesUsed==n-1) break;
         }
         if(edgesUsed!=n-1){
             return -1;
         }
         return mstWeight;
     }

}
