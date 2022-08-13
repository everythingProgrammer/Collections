package DDArrays;

import java.util.ArrayList;

public class Rotateby90 {

    public static ArrayList<ArrayList<Integer>> transpose (ArrayList<ArrayList<Integer>> A){

        for(int i = 0 ; i<A.size(); i++){
            for(int j = i+1; j<A.size(); j++){
                int temp = A.get(i).get(j);
                int temp2 = A.get(j).get(i);
                A.get(i).remove(j);
                A.get(i).add(j,temp2);
                A.get(j).remove(i);
                A.get(j).add(i,temp);
            }
        }
//        System.out.println("After Reflecting ");
//        for(ArrayList<Integer> m: A){
//            System.out.println(m);
//        }

        return A;
    }
    public static  void reflect (ArrayList<ArrayList<Integer>> matrix)
    {
        int n = matrix.size();
        for(int i = 0 ; i<n ; i++ ){
            ArrayList<Integer> thold = matrix.get(i);
            for(int j = 0; j<n/2 ; j++){
                int j0 = thold.get(j);
                int j1 = thold.get(n-1-j);
                thold.remove(j);
                thold.add(j,j1);
                thold.remove(n-1-j);
                thold.add(n-1-j,j0);
            }
        }
//        System.out.println("After Reflecting ");
//        for(ArrayList<Integer> m: matrix){
//            System.out.println(m);
//        }
//        return matrix;
    }

    public static  void solve(ArrayList<ArrayList<Integer>> A) {

//        ArrayList<ArrayList<Integer>> rec =  transpose(A);
        transpose(A);
        reflect(A);
//        System.out.println(" In solve function After Transpose");

//        for(ArrayList<Integer> m: A){
//            System.out.println(m);
//        }

    }
    public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

            for(int i = 0; i<4; i++){
                ArrayList<Integer> tholder  = new ArrayList<>();
                for(int j = 0; j<4 ; j++){
                    tholder.add(j+1);
                }
                matrix.add(tholder);
            }

            System.out.println("Original Matrix");
            for(ArrayList<Integer> m: matrix){
                System.out.println(m);
            }

//            System.out.println("Rotated ");
              solve(matrix);
//            for(ArrayList<Integer> m: matrix){
//                System.out.println(m);
//            }

    }



}
