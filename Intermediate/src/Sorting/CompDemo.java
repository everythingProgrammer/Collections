package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompDemo {

    public static void sortByNumber() {
        Comparator<Integer> customComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {


                return o1 - o2;
            }
        };

        Comparator<Integer> numComparator = (Integer s1, Integer s2) ->
        {
            return s1-(s2);
        };



    }

    public static void main(String[] args) {

        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(3);
        obj.add(30);
        obj.add(34);
        obj.add(9);
        obj.add(5);


//        int one =  9 ;
//        int two = 32;
//        int temp1 =  (int)    (   one * Math.pow(10, (two+"").length())  )+two;
//        System.out.println( temp1  );
//        int temp2 =  (int)    (   two * Math.pow(10, (one+"").length())  )+one;
//        System.out.println( temp2  );


//        Collections.sort(obj, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int one = (int) ((int) o1 * Math.pow(10, o2+"".length())) + o2;
//                int two = (int) ((int) o2 * Math.pow(10, o1+"".length())) + o1;
//
//                return two-one;
//            }
//        });

        Comparator<Integer> normalComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                System.out.println("o1="+o1+", o2= "+o2+" => "+( o1-o2) ) ;
//                return o1 - o2;
                System.out.println("o1="+o1+", o2= "+o2+" => "+( o2-o1) ) ;
                return o2 - o1;
            }
        };

        Comparator<Integer> sortComparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                int one = (int) ((int) o1 * Math.pow(10, (o2+"").length())) + o2;
                int two = (int) ((int) o2 * Math.pow(10, (o1+"").length())) + o1;

                return two-one;
            }
        };

        Collections.sort(obj, normalComparator);

        System.out.println(obj);
    }




}
