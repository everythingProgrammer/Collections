package Sorting;

import java.util.*;

public class LargestNumber {

    // Using Integers
    public static String largestNumber(final List<Integer> A) {

        ArrayList<Integer> list2 = new ArrayList<>(A);
        int c = 0;
        for(int i = 0 ; i<A.size(); i++){
            if(A.get(i) != 0){
                c++;
                break;
            }
            if( i == A.size()-1){
                return "0";
            }

        }

        Comparator<Integer> sortComparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                long one = (long)  ((long) o1 * Math.pow(10, (o2+"").length())) + o2;
                long two = (long) ((long) o2 * Math.pow(10, (o1+"").length())) + o1;

                return (int)( two-one);
            }
        };
        Collections.sort(list2,sortComparator);

        String ans = "";
        for(Integer a : list2){
            ans  = ans+a;
        }


        return ans;

    }

    // Converting Integers to Strings and then
    // Dictionary comparison
    public static String largestNumber2(final List<Integer> A) {



        int countNonZeroes = 0;
        // Creating String list from Input and also checking if input only contains zeroes...
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0 ; i<A.size(); i++){
            if( countNonZeroes ==0 &&  A.get(i) !=0){
                countNonZeroes++;
            }
            list2.add( A.get(i).toString());
        }
        // if count containsOnly zeroes then return "0"
        if(countNonZeroes == 0){
            return "0";
        }

        Comparator<String> sortComparator = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                o1 = o1+o2;
                o2 = o2+o1;
                return o2.compareTo(o1) ;
            }
        };

        Collections.sort(list2,sortComparator);

        String listString = String.join("", list2);
        return listString;

    }



    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();

        int count = sr.nextInt();

        for(int i = 0 ; i<count ; i++){
            ans.add(sr.nextInt());
        }

        System.out.println(largestNumber2(ans));
    }


}
