package collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String []args){
        String key1  = new String("Key");
        String key2  = new String("Key");
        Map<String,Integer> map = new IdentityHashMap<>();
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(map);
    }
}
