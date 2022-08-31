import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();
        int m = sr.nextInt();
        int q = sr.nextInt();

        int matrix[][] = new int [n][m];

        int c = 1;
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<m ; j++){
                matrix[i][j] = c;
                c++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int rows[] = new int[n];
        int columns[] = new int[m];

        for(int i = 0; i<q ; i++){
            System.out.println(matrix);
            int nums = sr.nextInt();

            if(nums == 1){
                // Swap Columns
                int r1 = sr.nextInt() -1;
                int r2  = sr.nextInt() -1;
                if(r1 == r2){
                    continue;
                }
                for(int z = 0; z<n ; z++ ){

                    matrix [z][r1] = matrix[z][r1] + matrix[z][r2];
                    matrix [z][r2] = matrix[z][r1] - matrix[z][r2];
                    matrix [z][r1] = matrix[z][r1] - matrix[z][r2];

                }


            }else if(nums == 2){
                // Swap Rows
                int r1 = sr.nextInt() -1 ;
                int r2  = sr.nextInt() -1;
                if(r1 == r2){
                    continue;
                }
                for(int z = 0; z<m ; z++ ){

                    matrix [r1][z] = matrix[r1][z] + matrix[r2][z];
                    matrix [r2][z] = matrix[r1][z] - matrix[r2][z];
                    matrix [r1][z] = matrix[r1][z] - matrix[r2][z];

                }

            }else if( nums == 3){

                // Print Bitwise OR  X1Y1  X2Y2


                int x1 = sr.nextInt()-1;
                int y1 = sr.nextInt()-1;
                int x2 = sr.nextInt()-1;
                int y2 = sr.nextInt()-1;

                ans.add( (matrix[x1][y1] |  matrix[x2][y2]) ) ;


            }else if( nums == 4){
                // Print Bitwise OR  X1Y1  X2Y2
                int x1 = sr.nextInt()-1;
                int y1 = sr.nextInt()-1;
                int x2 = sr.nextInt()-1;
                int y2 = sr.nextInt()-1;

                ans.add( (matrix[x1][y1] &  matrix[x2][y2]) ) ;

            }

            System.out.println(matrix);

        }


        for(int a : ans){
            System.out.println(a);
        }
    }

}
