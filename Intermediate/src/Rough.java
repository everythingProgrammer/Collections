import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class Rough {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        Collections.sort(A);
        Collections.sort(B);

        int n = A.size();
        int m = B.size();
        int nc = 0;
        int mc = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for( ; nc<n && mc<m ;   ){
            int num1 = A.get(nc);
            int num2 = B.get(mc);

            if( num1 == num2){
                ans.add(num1);
                nc++;
                mc++;
            }else if(num1>num2){
                mc++;
            }else if(num1< num2){
                nc++;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(2);

        solve(a,b);
    }

}
