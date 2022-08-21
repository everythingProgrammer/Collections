package ModularArithematic;


//https://www.scaler.com/academy/mentee-dashboard/class/32196/assignment/problems/5840/submissions

public class SameRemainder {


    public static int solve(int A, int B) {
        int max = Math.max(A,B);

        int a = Math.max(A,B);
        int b = Math.min(A,B);
        int commonFactor = 1;
//        long sysTime3 = System.currentTimeMillis();
        for(int i = 1 ; i<=(a-b); i++){

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


    /*
        a=23, b= 11, (a-b)= 12, i=1,(a-b)%i = 0
        a=23, b= 11, (a-b)= 12, i=2,(a-b)%i = 0
        a=23, b= 11, (a-b)= 12, i=3,(a-b)%i = 0
        a=23, b= 11, (a-b)= 12, i=4,(a-b)%i = 0
        a=23, b= 11, (a-b)= 12, i=5,(a-b)%i = 2
        a=23, b= 11, (a-b)= 12, i=6,(a-b)%i = 0
        a=23, b= 11, (a-b)= 12, i=7,(a-b)%i = 5
        a=23, b= 11, (a-b)= 12, i=8,(a-b)%i = 4
        a=23, b= 11, (a-b)= 12, i=9,(a-b)%i = 3
        a=23, b= 11, (a-b)= 12, i=10,(a-b)%i = 2
        a=23, b= 11, (a-b)= 12, i=11,(a-b)%i = 1
        a=23, b= 11, (a-b)= 12, i=12,(a-b)%i = 0
        12
     */
}
