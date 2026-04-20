package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {


    public static void main (String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0,12);
        list.add(1,2);
        list.add(2,4);

        list.addLast( 23);
        list.addFirst(34);
        System.out.println(list.toString());


    }
}
