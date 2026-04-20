package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{



    public int compare (Integer o1 , Integer o2){
        return o2-o1;
    }

}


public class CustomComparator  {


    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(55);
        list.add(458);
        list.add(-1);
        list.add(384);
        list.add(-434);
        list.add(44);
        list.add(344);
        list.add(4562);
        list.add(124);
        list.add(833);

        list.sort(new MyComparator());
        System.out.println(list.toString());



    }


}
