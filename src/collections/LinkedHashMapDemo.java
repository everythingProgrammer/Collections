package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {


    // Linked Hashmap maintains Order
    // Linked Hashmap has double linked list
    // Once a element is accessed it is shifted to end ,
    //
    // Can be used to check the least used/access element.
    // again not thread safe
    //
    public static void main(String args[]){
        LinkedHashMap<String , Integer> linkedHashMap = new LinkedHashMap<>(12,0.8f,true);
        HashMap<String,Integer> hashMap = new HashMap<>();
        linkedHashMap.put("Orange" , 10 );
        linkedHashMap.put("Apple" , 10 );
        linkedHashMap.put("Eggs" , 10 );
        linkedHashMap.put("Fish" , 10 );

        linkedHashMap.get("Eggs");
        linkedHashMap.get("Orange");
        for(Map.Entry<String,Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }

        // converting hashmap to Linked Hash Map
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        // SOme methods like

    }
}
