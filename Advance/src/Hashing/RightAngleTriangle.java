package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RightAngleTriangle {

    /*
       Right angle triangle with  two sides parallel to x-axis and y-axis
    */

    /*
    TC : O(N^2)
    SC : O(N)
    */
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        // In Hashmap all the points will be saved as strings   x1_y1
        HashSet<String> points = new HashSet<>();
        for(int i = 0 ; i<A.size(); i++){
            String point = A.get(i)+"_"+B.get(i);
            points.add(point);
        }
        long count = 0;
        for(int i = 0 ; i<A.size(); i++){

            for(int j = i+1 ; j<A.size(); j++){
                if(i == j){
                    continue; // if i and j pointing to same point then skip
                }
                if(!isParallel(A.get(i),B.get(i),A.get(j),B.get(j))){
                    String p1 = A.get(i)+"_"+B.get(j);
                    String p2 = A.get(j)+"_"+B.get(i);
                    if(points.contains(p1)){
                        count++;
                    }
                    if(points.contains(p2)){
                        count++;
                    }
                    count = count %1000000007;
                }
            }
        }
        return (int) count;
    }
    public boolean isParallel(int x1, int y1, int x2, int y2){
        if(y1 == y2 || x1== x2){
            return true;
        }
        return false;
    }

    public static int solve2(ArrayList<Integer> A, ArrayList<Integer> B) {

        HashMap<Integer, Integer> horizontalFreq = new HashMap<>();// all points where y is same
        HashMap<Integer, Integer> verticalFreq = new HashMap<>(); // all points on same x-axis where x is same

        for(int i = 0 ; i<A.size(); i++){
            verticalFreq.put(A.get(i), verticalFreq.getOrDefault(A.get(i),0)+1);
            horizontalFreq.put(B.get(i), horizontalFreq.getOrDefault(B.get(i),0)+1);
        }
        long count = 0;
        for(int i = 0 ; i<A.size(); i++){
            long x_candidates = verticalFreq.get(A.get(i))-1;
            long y_candidates = horizontalFreq.get(B.get(i))-1;

            count += x_candidates*y_candidates;
            count = count%1000000007;

        }
        return (int) count;

    }

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        x.add(1);
        x.add(1);
        x.add(2);

        y.add(1);
        y.add(2);
        y.add(1);
        System.out.println(solve2(x,y));
    }
}
