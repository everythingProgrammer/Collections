package collection;

import java.util.ArrayList;
import java.util.List;

public class Listing {

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        list.get(0);
        list.add(89);
        list.size();
        for(int i = 0 ; i < 2; i++){
            System.out.println(list.get(i));
        }
        for(int x: list){
            System.out.println(x);
        }

        System.out.println(list.contains(39));

        // list.remove needs an index to be removed
        list.remove(3);
        // list .add (index , element)
        list.add(1,2);


        // to replace element at any index
        list.set(3,40);

    }
}
