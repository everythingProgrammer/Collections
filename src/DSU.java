public class DSU {


    int parent[];
    int rank[];

    DSU(int n){
        parent = new int[n];
        rank  = new int[n];

        for(int i = 0 ; i<n; i++){
            parent[i] = i;
        }
    }



    int find(int x){


        if(parent[x] == x){
            return x;
        }
        int node = find(parent[x]);
        parent[x] = node;
        return node ;

    }


    void union(int u, int v){
        int pu = find(u);
        int pv = find(v);
        if(pv==pu) return;

         if(rank[pv]>rank[pu]){
            parent[pu] = pv;
        }
        else if(rank[pu]>rank[pv]){
            parent[pv]= pu;
        }else{
            parent[pv] = pu;
            rank[pu]++;
         }

    }

}
