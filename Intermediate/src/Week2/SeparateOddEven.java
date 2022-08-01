package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddEven {

//    public static ArrayList<ArrayList<Integer>> getNums(ArrayList<Integer>nums){
//        ArrayList<>
//
//
//    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int T = sr.nextInt();
        int N = 0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> even;
        ArrayList<Integer> odd;
        String str = "";
        while(T-->0){
            N = sr.nextInt();
            even = new ArrayList<>();
            odd = new ArrayList<>();
            for(int i = 0 ; i<N; i++){
                int num = sr.nextInt();
                if(num%2==0){
                    even.add(num);
                }else{
                    odd.add(num);
                }
            }
            ans.add(odd);
            ans.add(even);

        }

        for(ArrayList<Integer> num: ans){
            for(Integer st :num){
                System.out.print(st+" ");
            }
            System.out.println();
        }

    }

}
