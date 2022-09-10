package Recursion;

public class IsMagic {

    public static int solve(int A) {
        return recursiveSum(A);
    }


    public static int recursiveSum(int A){
        if(A <10){
            if(A == 1){
                return 1;
            }else {
                return 0;
            }
        }else{
            return recursiveSum(sum(A));
        }

    }
    public static int sum(int A){
        if(A<10){
            return A;
        }
        int sum = 0;
        return sum+= A%10 + sum(A/10);
    }

    public static void main(String[] args) {
        System.out.println(solve(83557));
    }
}
