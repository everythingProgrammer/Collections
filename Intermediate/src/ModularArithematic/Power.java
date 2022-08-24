package ModularArithematic;

public class Power {

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

}
