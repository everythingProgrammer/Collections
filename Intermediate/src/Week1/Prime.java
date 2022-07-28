package Week1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();

        int count =0;
        //using sqrt(n)
        for(int i = 1 ; i<= Math.sqrt(a) ;i++){
            if(a%i == 0) {
                if (i * i == a) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        if(count > 2){
            System.out.println("NO");
        }else if(count==2){
            System.out.println("YES");
        }

    }
}
