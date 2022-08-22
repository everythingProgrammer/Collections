package ModularArithematic;


//https://www.scaler.com/academy/mentee-dashboard/class/32196/assignment/problems/5840/submissions

public class SameRemainder {


    /*
        we want
         A%M = B%M   such that we have value of M greatest possible

         =>  A%M - B%M = 0
             (A-B)%M = 0
              Now Max value of A-B such that  M is maximum can be


     */
    public static int solve(int A, int B) {
        int max = Math.max(A,B);
        int a = Math.max(A,B);
        int b = Math.min(A,B);

        int commonFactor = 1;


        return (a-b);
    }


    public static void main(String[] args) {
        System.out.println(solve(11,37));
    }


    /*
       (a-b) = 26
        a=37, b= 11, i=1,(a-b)%i = 0
        a=37, b= 11, i=2,(a-b)%i = 0
        a=37, b= 11, i=3,(a-b)%i = 2
        a=37, b= 11, i=4,(a-b)%i = 2
        a=37, b= 11, i=5,(a-b)%i = 1
        a=37, b= 11, i=6,(a-b)%i = 2
        a=37, b= 11, i=7,(a-b)%i = 5
        a=37, b= 11, i=8,(a-b)%i = 2
        a=37, b= 11, i=9,(a-b)%i = 8
        a=37, b= 11, i=10,(a-b)%i = 6
        a=37, b= 11, i=11,(a-b)%i = 4
        a=37, b= 11, i=12,(a-b)%i = 2
        a=37, b= 11, i=13,(a-b)%i = 0
        a=37, b= 11, i=14,(a-b)%i = 12
        a=37, b= 11, i=15,(a-b)%i = 11
        a=37, b= 11, i=16,(a-b)%i = 10
        a=37, b= 11, i=17,(a-b)%i = 9
        a=37, b= 11, i=18,(a-b)%i = 8
        a=37, b= 11, i=19,(a-b)%i = 7
        a=37, b= 11, i=20,(a-b)%i = 6
        a=37, b= 11, i=21,(a-b)%i = 5
        a=37, b= 11, i=22,(a-b)%i = 4
        a=37, b= 11, i=23,(a-b)%i = 3
        a=37, b= 11, i=24,(a-b)%i = 2
        a=37, b= 11, i=25,(a-b)%i = 1
        a=37, b= 11, i=26,(a-b)%i = 0
        26
     */
}
