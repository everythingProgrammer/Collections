package Arrays;

import java.util.ArrayList;

public class MergeIntervals {
  public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> arr = new ArrayList<>();
        int i = 0;
        for(Interval curr: intervals){

            if(curr.end<= newInterval.start){
                arr.add(curr);
                i++;
            }else if(curr.start >= newInterval.end){
                arr.add(newInterval);
                while(i<intervals.size()){
                    arr.add(intervals.get(i));
                    i++;
                }
                return arr;
            }else {
                newInterval.start  = Math.min(curr.start,newInterval.start);
                newInterval.end    = Math.max(curr.end,newInterval.end);
                i++;
            }
        }
        arr.add(newInterval);
        return arr;
    }
}
