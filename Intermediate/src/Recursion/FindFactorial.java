package Recursion;

public class FindFactorial {

    public static int solve(int A) {

        return fact(A);


    }

    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return  n* fact(n-1);
    }


    public static void main(String[] args) {

    }

}
