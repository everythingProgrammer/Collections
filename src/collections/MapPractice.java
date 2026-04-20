package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    // No odering in hashmap
    // Values can be numm
    // Key - only 1 key can be null
    // Not Synchronized
    // Constant time for get and put  O(1) , containsKey() is also O(1)
    /*
                Internal Structure of HashMap

                Basic components Key , value , Bucket , HashFunction

                Bucket - Bucket is array of LinkedList eg Node < K,V> [] bucket default size ( 16 ) ;
                        Key Value pairs in hashmap are stored in buckets.

                            Each  bucket stores Node objects
                                static class Node<K,V> {
                                    final int hash;
                                    final K key;
                                    V value;
                                    Node<K,V> next;
                                }

                 Hash Function - algorithm that takes input and return fixed size string of bytes typically a numerical value.
                        The output is known as hashcode hashvalue or simply hash. the primary purpose of a hash function is to map
                        data of arbitrary size of data of fixed size .
                   Deterministic : same input gives out same output .
                   Fixed output size : Regradless of input size the outptu size remains constant 32 bits or 64 bits
                   Efficient Computation: Hashfunction should calculate hash code quickly .



               How Data is stored in hashmap .
                S1 Calcualate hashcode .
                S2 calculate the index - int index = HashCode % ArraySize ;
                S3 storing in the bucket - stored in index , there might be multiple nodes at an index to handle collision.


                In a bucket , once entries exceed a threshold ( 8 by default )  , linkedlist gets converted to RED BLACK TREE




                HashMap Resizing ( Re Hashing  )

                    HashMap has an internal arraySize , which by default is 16 .
                    Default Load Factor is 0.75 ( ie as soon as hashmap size is filled upto 75% , hasmap is resized automatically )

                    The array size is doubled .
                        all existing entires are rehashed

                     Hashmap provides O(1) for put and get
                     if too many collisons time is O(n) using linked list
                     after java 8  worst case is O(log n ) using red black trees .




     */
    public static void main(String args[]){
        HashMap<Integer , String > map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        System.out.println(map.get(3));
        System.out.println(map.get(44));

        System.out.println(map.containsKey(33));
        System.out.println(map.containsValue("F"));


        Set<Integer> mapKeySet = map.keySet();
        for(int i : mapKeySet){
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry: entries){
            String s = entry.getKey() + " - " + entry.getValue();
            String s2;
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry);
        }
        // remove return boolean type
        map.remove(5);



        //
        map.getOrDefault(4,"NotFound");
        map.putIfAbsent(3,"R");
//        map.removeValue("5");5



        String key1 = new String("key");
        String key2 = new String("key");
        if(key1.equals(key2)){
            System.out.println("same");
        }
    }
}
