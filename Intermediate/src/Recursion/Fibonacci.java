package Recursion;

public class Fibonacci {

    public int findFibo(int n, int A, int a, int b){

        if(n==A){
            return b;
        }
        return findFibo(n+1,A,b,b+a);

    }


    public int findAthFibonacci(int A) {

        return findFibo(2,A,0,1);
    }

}
