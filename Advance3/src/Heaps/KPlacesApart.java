package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KPlacesApart {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int i = 0 ;
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MinComparator());
        ArrayList<Integer> ans = new ArrayList<>();
        if( A.size() == B){
            for(; i<B ;i++){
                pq.add(A.get(i));
            }
            while(!pq.isEmpty()){
                ans.add(pq.poll());
            }
            return ans;
        }
        for(; i<=B; i++){
            pq.add(A.get(i));
        }
        int pos = 0;

        for(;i<A.size();i++){
            ans.add(pq.poll());
            pq.add(A.get(i));
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;


    }

    class MinComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }
}
