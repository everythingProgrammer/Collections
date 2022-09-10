package Recursion;

public class SumOfDigits {

    public int solve(int A) {

        return  sumOfDigits(A);

    }

    public int sumOfDigits(int A){

        if(A==0){
            return 0;
        }
        return   A%10 + sumOfDigits(A/10);


    }
}
