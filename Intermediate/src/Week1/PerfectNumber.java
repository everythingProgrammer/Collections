package Week1;

import java.util.Scanner;

public class PerfectNumber {


    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        String ans = "";
        while(N>0) {
        int num = sr.nextInt();
            int sum = 0;
            sum += 1;

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {

                    if (i * i == num) {
                        sum += i;
                    } else {
                        sum += i;
                        sum += (num / i);
                    }
                }
            }
            ans+= sum==num?"YES\n":"NO\n";
            N--;
        }
        System.out.println(ans);
    }

}
