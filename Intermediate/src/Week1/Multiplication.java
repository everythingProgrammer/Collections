package Week1;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        int prev = 0;
        for(int i = 1; i<=10; i++){

            System.out.println(num+" * "+i+" = "+(num+prev));
            prev = num+prev;
        }
    }
}
