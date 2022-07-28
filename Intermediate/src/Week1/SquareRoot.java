package Week1;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        int ans = -1;

        int l =1;
        int r = num;
        while(l<=r){
            int mid = (l+r)/2;
            double square = Math.pow(mid,2);
            if (square== num){
                ans = mid;
                break;
            }
            else if ( (square) < num){
                l = mid+1;
            }else if ( (square) > num){
                r = mid-1;
            }
        }
        System.out.println(ans);
    }
}
