package Week1;

import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        int dp[] = new int[10];
        dp[0] = 0;
        for(int i = 1; i<10 ; i++){
            dp[i] = i*i*i;
        }
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();

        for(int i = 1; i<=N ; i++){
            int num  = i;
            int sum =0;
            while(num>0){
                int c = num%10;
                sum += c*c*c ;
                num=num/10;
            }
            if(sum == i){
                System.out.println(sum);
            }

        }
    }
}
