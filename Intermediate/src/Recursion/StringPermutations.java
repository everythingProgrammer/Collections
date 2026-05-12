package Recursion;

import java.util.ArrayList;

public class StringPermutations {

    public static ArrayList<String> getPermutations(String str){

        if(str.length()==0){
            ArrayList<String> rs  = new ArrayList<>();
            rs.add("");
            return rs;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rr=   getPermutations(ros);

        ArrayList<String> mr = new ArrayList<>();

        for(String rrs:rr){
            for(int i = 0;i<=rrs.length(); i++){
                String st = rrs.substring(0,i)+ch+rrs.substring(i);
                mr.add(st);
            }
        }
        return mr;


    }

    /*
        Answer so far approach
     */
    public static void getPermutationsAnsSoFarApproach(String str,String answerSoFar){
        if(str.isEmpty()){
            System.out.println(answerSoFar);
        }

        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

            String remaining = str.substring(0,i)+str.substring(i+1);

            getPermutationsAnsSoFarApproach(remaining,answerSoFar+ch);
        }



    }


}
