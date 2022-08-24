package ModularArithematic;

public class ModString {
    /*
        a - is the digit ,
        n - power ,
        p - divisor,
        power(a,n ,p) =  a^n %p;
     */
    public static int power(int a, int n , int p){
        int ans = 1;
        for(int i =1 ; i<= n ; i++){
            ans =  (ans%p * a%p )%p;

        }
        return ans;
    }


    public static int findMod(String A, int B) {
        int ans = 0;
        int len  = A.length();
        for(int i = 0 ; i<A.length(); i++){
            int pow =power(10,len-1-i,B);
            ans =  ( (Integer.parseInt(A.charAt(i)+"")%B)* pow ) + ans;
            ans= ans%B;
        }
        return ans;
    }

    /* Self Improvised */
    public static int findMod3(String A, int B) {

        long sum = 0;

        for(int i = 0 ; i<A.length() ; i++){

            sum =   ((sum * 10)%B + ( A.charAt(i) -'0' ) )%B ;
//            sum = sum%B;

        }
        return (int)sum;

    }


    /*
        Rough Work
     */
    public static void sum(String A){
        int sum = 0;

        for(int i = 0 ; i<A.length(); i++){

            sum = sum*10 + Integer.parseInt(A.charAt(i)+"");
            System.out.println("i = "+i+",  sum = "+ sum);
        }


    }


    /*Correct */
    public static int findMod2(String A, int B){
        long res = 0;

        for (int i = 0; i < A.length(); i++) {
            System.out.print("res - "+res+", ");
            System.out.print(" next digit "+ A.charAt(i)+" , ");
            long digit = (res * 10 + (int) A.charAt(i) - '0');
            System.out.print("   next digit "+ digit+" , \n");

            res = (res * 10 + (int) A.charAt(i) - '0') % B;
            System.out.println("(res * 10 + (int) A.charAt(i) - '0') % B  - "+res+" ");
        }
        return (int) res;
    }

    public static void main(String[] args) {
//        System.out.println(findMod2("123",4));
        sum("123456789");
    }


}
