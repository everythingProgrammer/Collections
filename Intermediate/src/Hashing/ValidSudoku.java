package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ValidSudoku {

    public static int isValidSudoku(final List<String> A) {

        for(int i = 0 ; i<9 ; i++){

            HashSet<Character> hs = new HashSet<>();
            // Scanning in Rows
            for(int j = 0 ; j<9; j++){
                if( A.get(i).charAt(j)!='.' && hs.contains(A.get(i).charAt(j))){
                    return 0;
                }
                hs.add(A.get(i).charAt(j));
            }
            //Scanning in Columns
            HashSet<Character> cs = new HashSet<>();
            for(int j = 0 ;j<9; j++){

                if(A.get(j).charAt(i) !='.' && cs.contains(A.get(j).charAt(i))){
                    return 0;
                }
                cs.add(A.get(j).charAt(i));
            }
        }

//        Scanning 3X3 Columns

//        int row = 1;
//        int col = 1;
//        for(int i = row-1;i<row+2 && row<9 && i<9; i++, row = 1, col+=3 ){
//            HashSet<Character> matrix = new HashSet<>();
//            for(int j = col-1; j<col+2 && col < 9 && j<9; j++){
//                if(  A.get(i).charAt(j) !='.' && matrix.contains(A.get(i).charAt(j))){
//                    return 0;
//                }
//                matrix.add(A.get(i).charAt(j));
//            }
//            row = row+3;
//
//        }

        for(int r = 0; r<9 ;r+=3){
            for(int c = 0; c<9 ; c+=3){
                HashSet<Character> matrix = new HashSet<>();
                for(int i = r; i<r+3  && i<9; i++ ){
                    for(int j = c; j<c+3   && j<9; j++){
                        if(  A.get(i).charAt(j) !='.' && matrix.contains(A.get(i).charAt(j))){
                            return 0;
                        }
                        matrix.add(A.get(i).charAt(j));
                    }
                }
            }
        }
        return 1;
    }


    public static int optimal(final List<String> A){

            if (A == null)
                return 0;

            int n = A.size();

            if (n != 9 || A.get(0).length() != 9)
                return 0;

            HashSet<Character> hashSet = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                hashSet.clear();
                for (int j = 0; j < 9; j++) {
                    char c = A.get(i).charAt(j);
                    if (c == '.')
                        continue;
                    if (hashSet.contains(c))
                        return 0;
                    hashSet.add(c);
                }
            }

            for (int i = 0; i < 9; i++) {
                hashSet.clear();
                for (int j = 0; j < 9; j++) {
                    char c = A.get(j).charAt(i);
                    if (c == '.')
                        continue;
                    if (hashSet.contains(c))
                        return 0;
                    hashSet.add(c);
                }
            }


            for (int k = 0; k < 9; k++) {
                int x = k / 3;
                int y = k % 3;
                hashSet.clear();
                for (int i = 3 * x; i < 3 * x + 3; i++) {
                    for (int j = y * 3; j < y * 3 + 3; j++) {
                        char c = A.get(j).charAt(i);
                        if (c == '.')
                            continue;
                        if (hashSet.contains(c))
                            return 0;
                        hashSet.add(c);
                    }
                }

            }


            return 1;


    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("....5..1.");
        list.add(".4.3.....");
        list.add(".....3..1");
        list.add("8......2.");
        list.add("..2.7....");
        list.add(".15......");
        list.add(".....2...");
        list.add(".2.9.....");
        list.add("..4......");

        //Printing Out Sodoku

        for(int i = 0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                System.out.print(list.get(i).charAt(j)+" ");
            }
            System.out.println();
        }

        System.out.println(isValidSudoku(list));
    }
}
