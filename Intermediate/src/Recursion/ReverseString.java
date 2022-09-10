package Recursion;

public class ReverseString {


    public static void reverse(int i  , String S){

        if(i<S.length()-1){
            reverse(i+1,S);
        }
        System.out.print(S.charAt(i));


    }


    public static void main(String[] args) {
        reverse(0,"Scaler");
    }


}
