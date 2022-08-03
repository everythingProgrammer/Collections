package Arrays;

import java.util.Scanner;

public class MinMax {


    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
//        int nums[] = new int[N];
        int num = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<N ; i++){
            num  = sr.nextInt();
            max= Math.max(max,num);
            min=Math.min(min,num);
        }
        System.out.println(max+" "+min);


    }

}
