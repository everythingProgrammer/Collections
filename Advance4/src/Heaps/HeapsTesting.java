package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapsTesting {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MaxComparator());

        pq.add(1);
        pq.add(15);
        pq.add(30);
        pq.add(54);
        pq.add(26);
        System.out.println(pq);
    }

    static class MaxComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            // Reverse order to make it a max heap
            return b.compareTo(a);
        }
    }

}
