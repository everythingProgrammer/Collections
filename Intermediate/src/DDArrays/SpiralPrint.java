package DDArrays;

import java.util.ArrayList;

public class SpiralPrint {



    public static  ArrayList<ArrayList<Integer>> generateMatrix(int A,int b) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i<A ; i++){
            ans.add(new ArrayList<>(A));
        }

        int rs ,re , cs , ce ;
        rs = cs = 0;
        re = ce = A-1;
        int num = 1;
        for(int i = 1;ce>cs&& re>rs ; i++){
            // adding top row
            for(int k = cs ; k<=ce ; k++){
                System.out.println(i-1+"  "+ans.get(i-1).size());
                int indx = ans.get(i-1).size()>0?ans.get(i-1).size():0 ;
                ans.get(i-1).add( k ,num);
                 num++;
            }
            rs++;
            // adding rightmost column
            for(int k = rs; k<=ce; k++ ){
                ans.get(k).add(ans.get(k).size()-1>0?ans.get(k).size()-1:0,num);
                num++;
            }
            ce--;
            // adding bottom row
            for(int k = ce ; k>=cs; k--){
//                ArrayList<Integer> a = new ArrayList<>(A) ;

                ans.get(re).add(k,num);
                num++;
            }
            re--;
            // adding leftmost row

            for(int k = re; k>=rs; k--){
                ans. get(k).add(i-1,num);
                num++;
            }
            cs++;
        }

            return ans;
    }




    public static ArrayList<ArrayList<Integer>> generateMatrix(int size){
        // Create row and col
        // to traverse rows and columns
        int row = 0, col = 0;

        int boundary = size - 1;
        int sizeLeft = size - 1;
        int flag = 1;

        // Variable to determine the movement
        // r = right, l = left, d = down, u = upper
        char move = 'r';

        // Array  for matrix
        int matrix[][] = new int[size][size];
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();


        for (int i = 1; i < size * size + 1; i++) {

            // Assign the value
            matrix[row][col] = i;
//            matrix.get(row).add(col,i);

            // switch-case to determine the next index
            switch (move) {

                // If right, go right
                case 'r':
                    col += 1;
                    break;

                // if left, go left
                case 'l':
                    col -= 1;
                    break;

                // if up, go up
                case 'u':
                    row -= 1;
                    break;

                // if down, go down
                case 'd':
                    row += 1;
                    break;
            }

            // Check if the matrix
            // has reached array boundary
            if (i == boundary) {

                // Add the left size for the next boundary
                boundary += sizeLeft;

                // If 2 rotations has been made,
                // decrease the size left by 1
                if (flag != 2) {

                    flag = 2;
                }
                else {

                    flag = 1;
                    sizeLeft -= 1;
                }

                // switch-case to rotate the movement
                switch (move) {

                    // if right, rotate to down
                    case 'r':
                        move = 'd';
                        break;

                    // if down, rotate to left
                    case 'd':
                        move = 'l';
                        break;

                    // if left, rotate to up
                    case 'l':
                        move = 'u';
                        break;

                    // if up, rotate to right
                    case 'u':
                        move = 'r';
                        break;
                }
            }
        }


        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i<size;i++ ){
            ans.add(new ArrayList<>());
        }


        for(int i = 0 ; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[i].length; j++){
                ans.get(i).add(j,matrix[i][j]);
            }
        }



        return ans;

    }


    public static void main(String args[]){

        int n = 5;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ans = generateMatrix(n);

        for(ArrayList<Integer> a: ans){
            System.out.println(a);
        }

    }

}
