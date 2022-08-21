package BitManipulations;

import java.util.ArrayList;
import java.util.Scanner;

public class BitCompression {

    public static int compressBits(ArrayList<Integer> A) {

        for(int j = 1; j<A.size(); j++){
            int Ai = A.get(j-1);
            int Aj = A.get(j);

            A.remove(j-1);
            A.add(j-1, Ai& Aj);
            A.remove(j);
            A.add(j,Ai|Aj);

        }
        int xor = 0;
        for(int j = 0 ; j<A.size(); j++){
            xor = xor^A.get(j);
        }
        return xor;
    }

    public static int compressBits2(ArrayList<Integer> A) {

        int xor = 0;
        int last = A.get(0);
        for(int j = 1; j<A.size(); j++){
            int Ai = last;
            int Aj = A.get(j);


//            A.remove(j);
//            A.add(j,Ai|Aj);

            last = (Ai|Aj);

            xor = xor^ (Ai&Aj);
        }
        xor = xor ^ (last);
        return xor;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        for(int i = 0 ; i<n ; i++){
            A.add(sr.nextInt());
        }
        ArrayList<Integer> B  = new ArrayList<>(A);
        System.out.println(compressBits(A));
        System.out.println(compressBits2(B));
    }

}
