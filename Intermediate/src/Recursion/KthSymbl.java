package Recursion;

public class KthSymbl {

    public static int solve(int A, int B) {


        return Character.getNumericValue(findChar(A,B,1,new StringBuilder("0")));

    }

    public static Character findChar(int A, int B , int currRow , StringBuilder currString){

        if(currRow == A){
            return currString.charAt(B-1);
        }
        StringBuilder newString = new StringBuilder();
        for(int i = 0; i<currString.length(); i++){
            if(currString.charAt(i)=='0'){
                newString.append("01");
            } else if (currString.charAt(i)=='1') {
                newString.append("10");
            }
        }

        return findChar(A ,B,currRow+1,newString);

    }

    public static void main(String[] args) {
        System.out.println(solve(2,2));
    }

}
