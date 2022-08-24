package ModularArithematic;

import java.util.ArrayList;
import java.util.Scanner;

public class LeastCommonMultiple {

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int T = sr.nextInt();
        for(int i = 0 ; i< T; i++){
            nums.add(new ArrayList<>());
        }

        for(int i = 0 ; i< T; i++){
            nums.get(i).add(sr.nextInt());
            nums.get(i).add(sr.nextInt());
        }
        for(int i = 0 ; i<T; i++){
            System.out.println(lcm(nums.get(i).get(0) , nums.get(i).get(1) ));
        }

    }



}
