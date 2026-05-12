package Recursion;

import java.util.ArrayList;

public class StringSubsequences {

    public static  ArrayList<String> getSubsequences(String str){

        if(str.isEmpty()){
            ArrayList<String> ans=  new ArrayList<>();
            ans.add("");
            return ans;
        }

        String currChar = str.substring(0,1);
        ArrayList<String> strings = getSubsequences(str.substring(1));
        ArrayList<String> returnList = new ArrayList<>(strings);

        for(String iterate: strings){
            returnList.add(currChar+iterate);
        }
        return returnList;

    }

    public static void printSubsequences(String str , String result) {
        if(str.length() == 0) {
            System.out.println(result);
            return ;
        }
        char sub = str.charAt(0);
        printSubsequences(str.substring(1) , result);
        printSubsequences(str.substring(1) , result+sub);
        return ;
    }
    public static void main(String args[]){
        String str = "abc";
        ArrayList<String >ans = new ArrayList<>();
        ans = getSubsequences(str);
//        System.out.println(ans.toString());

//        System.out.println("ans".substring(3));
        printSubsequences("ab","");
    }
}
