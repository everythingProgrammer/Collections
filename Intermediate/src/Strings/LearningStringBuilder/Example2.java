package Strings.LearningStringBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example2 {


    public static void main(String[] args) {




        ArrayList<String> list = new ArrayList<>();
        list.add("112");
        list.add("114");
        list.add("111");
        list.add("115");
        list.add("113");
        list.add("1");
        list.add("12");
        list.add("15");
        list.add("5");


        Comparator <String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //
                return o1.length()-o2.length() ;
            }
        };


        Collections.sort(list, lengthComparator);
        System.out.println(list);


    }



}
