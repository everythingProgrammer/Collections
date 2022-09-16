import java.util.ArrayList;

public class BigFactorial {

    static ArrayList<Integer> factorial(int N){
        //code here

        long fact = 1L;

        for(int i = 1; i<=N; i++){
            fact = fact*i;
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(fact>0){
            ans.add( (int) fact%10);
            fact = fact/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
