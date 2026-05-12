package Recursion;

public class NQueens {

    public static void main(String args[]){

        int n = 4;
        boolean [][] board = new boolean[n][n];

    }
    public static int solveNQueens(boolean[][]board , int row , String ansSoFar){


        for(int col = 0 ; col<board[0].length ; col++) {
            if (forwardDiagonalSafe(row,col,board)
            && backwardDiagonalSafe(row,col,board)
            && checkColumnSafe(row,col,board)
            && checkRowSafe(row,col,board)){
                board[row][col] = true;
                ansSoFar += " ["+row+","+col+"]" ;
            }
            // This is a safe place to put the queen

        }



        return 0;
    }

    public static boolean forwardDiagonalSafe(int row, int col, boolean[][]board){

        if(row>board.length || col >board[0].length || row<0 || col<0 ){
            return true; // because, if it reached here and didn't went false then safe
        }
        if(board[row][col] == true){ return false;}
        return forwardDiagonalSafe(row+1,col+1,board)&&forwardDiagonalSafe(row-1,col-1,board);

    }
    public static boolean backwardDiagonalSafe(int row , int col , boolean [][]board){
        if(row>board.length || col>board.length || row<0 || col<0){return true;}
        if(board[row][col] == true){return false;}
        // facing a true at board[row][col] means there is a queen placed at that place
        return  backwardDiagonalSafe(row+1,col-1,board) && backwardDiagonalSafe(row-1,col+1,board);
    }
    public static boolean checkColumnSafe( int row,int col, boolean board[][]){
        boolean safe = true;
        for(int i = 0 ; i<board.length; i++){
            safe = safe && board[row][i];
        }
        return safe;
    }
    public static boolean checkRowSafe( int row , int col , boolean board[][]){
        boolean safe = true;
        for(int i = 0 ; i<board[0].length ; i++){
            safe = safe && board[i][col];
        }
        return safe;
    }
    /*
        First requirement is that we need to check if there are any queens in the same diagonals
        or same column or same row .
     */
}
