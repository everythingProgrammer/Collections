package Recursion;

public class PowerFunction {

    public static int pow(int A, int B, int C) {

        return (int) power(A,B,C);
    }

    public static long power(int A,int B , int C){
        if(A==0){
            return 1%C;
        }
        if(B == 0){
            return 1%C;
        }
        if(B==1){
            return A%C;
        }
        if(B==2){
            return (A*A)%C;
        }

        long prod=  power(A,B/2,C);

        if((B&1) == 1){
            return ((prod*prod)%C * A%C)%C;
        }else{
            return   (prod*prod)%C;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(-1,1,20));
    }

}
