package Recursion;

public class ImplementPowerFunction {
    public int pow(int A, int B, int C) {
        /*
            B = 1 will create problem for when A -ve
         */


        if(A == 0){
            return 0;
        }
        if(B == 0 || A==1 ){
            return 1;
        }

        int halfPower = pow(A, B/2 , C);

        if( (B&1) == 1){
            return ( (( halfPower*halfPower )%C * A )%C +C )%C;
        }else{
            return (( halfPower*halfPower )%C +C)%C;
        }
    }
}
