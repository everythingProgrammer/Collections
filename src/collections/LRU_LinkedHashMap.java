package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_LinkedHashMap <K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public LRU_LinkedHashMap(int capacity){
        super(capacity,0.75f, true);
        this.capacity = capacity;
    }


    
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size()>capacity;
    }

    public static void main(String args[]){
        LRU_LinkedHashMap <String,Integer> studentMap = new LRU_LinkedHashMap<>(3);
        studentMap.put("Abc",23);
        studentMap.put("Abcd",23);
        studentMap.put("Abcde",23);
        studentMap.put("Abcdef",23);

        System.out.println(studentMap);
    }
}
