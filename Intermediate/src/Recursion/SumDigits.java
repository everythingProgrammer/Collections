package Recursion;

public class SumDigits {

    public static int solve(int A) {

return sum(A);
    }



    public static int sum(int A){
        if(A<10){
            return A;
        }
        int sum = 0;
        return sum+= A%10 + sum(A/10);
    }

    public static void main(String[] args) {
       System.out.println( solve(1999));
    }

}
