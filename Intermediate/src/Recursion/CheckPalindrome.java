package Recursion;

public class CheckPalindrome {


    public int checkPallindrome(String str, int i  ,int j){

        if(i>j){
            return 1;

        }

        if (str.charAt(i) == str.charAt(j)) {
            return checkPallindrome(str,i+1,j-1);
        }
        return 0;

    }

    public int solve(String A) {


        return checkPallindrome(A,0,A.length()-1);



    }

    public static void main(String[] args) {

    }


}
