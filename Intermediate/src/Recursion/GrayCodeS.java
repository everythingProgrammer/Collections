package Recursion;

import java.util.ArrayList;

public class GrayCodeS {
    public static  ArrayList< Integer > grayCode(int A) {
        int n = A;
        ArrayList < Integer > result = new ArrayList < > ();
        result.add(0);
        for (int i = 0; i < n; i++) {
            int curSize = result.size();
            // push back all element in result in reverse order
            for (int j = curSize - 1; j >= 0; j--) {
                result.add(result.get(j) + (1 << i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
         grayCode(4);
    }

}
