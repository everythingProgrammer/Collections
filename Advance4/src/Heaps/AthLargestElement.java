package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AthLargestElement {

    public static void main(String[] args) {
        AthLargestElement a = new AthLargestElement();
        ArrayList<Integer>  B = new ArrayList<>();
        B.add(3);
        B.add(4);
        B.add(5);
        B.add(6);
        B.add(2);
        B.add(1);
        B.add(7);
        a.solve(3,B);
    }

    public ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(A,new MinComparator());
        int i = 0 ;
        for(  ; i<A-1 && i<B.size(); i++){
            pq.add(B.get(i));
            ans.add(-1);
        }
        pq.add(B.get(i));
        i++;
        for(; i<B.size(); i++){
           ans.add(pq.peek());
           if(B.get(i) > pq.peek()){
               pq.poll();
               pq.add(B.get(i));
           }
        }
        ans.add(pq.poll());
        return ans;

    }
    class MinComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }
}
