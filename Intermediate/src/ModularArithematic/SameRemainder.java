package ModularArithematic;


//https://www.scaler.com/academy/mentee-dashboard/class/32196/assignment/problems/5840/submissions

public class SameRemainder {


    public static int solve(int A, int B) {
        int max = Math.max(A,B);

        int a = Math.max(A,B);
        int b = Math.min(A,B);
        int commonFactor = 1;
//        long sysTime3 = System.currentTimeMillis();
        for(int i = 1 ; i<=(a); i++){

//            System.out.println("a="+a+", b= "+b+", (a-b)= "+(a-b) +", i="+(i)+ ",a%i = "+ ((a)%i)+ ",b%i = "+ ((b)%i) );

            System.out.println("a="+a+", b= "+b+", (a-b)= "+(a-b) +", i="+(i)+ ",(a-b)%i = "+ ((a-b)%i) );


            if( (a-b)%i == 0 ){
                commonFactor= i;
            }
        }
//        long sysTime4 = System.currentTimeMillis();
//        System.out.println("With Iteration Approach "+ (sysTime4-sysTime3) );

        return commonFactor;
    }


    public static void main(String[] args) {
        System.out.println(solve(11,23));
    }
}
