package PracticalTesting;

import java.util.ArrayList;
import java.util.Arrays;

public class DNSCache {
    public static void main(String[] args) {
        ArrayList<String> urls = new ArrayList<>();

//        urls.add("hackerank.com"); // 5
//        urls.add("google.com");    // 5
//        urls.add("yahoo.com");     // 5
//        urls.add("gmail.com");     // 5
//        urls.add("yahoo.com");     // 2
//        urls.add("hackerank.com"); // 5
//        urls.add("gmail.com");     // 2

        urls.add("google.com"); // 5
        urls.add("yahoo.com");    // 5
        urls.add("google.com");     // 5
        urls.add("yahoo.com"); // 5
        urls.add("corcera.com"); // 5


//        System.out.println((getMinTime(3, 2, 5, urls)));
        for(int a : getMinTime(2, 2, 3, urls)){
            System.out.print(a+" ");
        }
//        testArrayList();
    }
    public static void testArrayList(){
        ArrayList<String > list = new ArrayList<>();
        list.add("google0");
        list.add("google1");
        list.add("google2");
        System.out.println("ArrayList 1st pass "+list.toString());
        list.remove(0);
        list.add("google3");
        System.out.println("ArrayList 2nd pass "+list.toString());
        list.remove(0);
        list.add("google4");
        System.out.println("ArrayList 3rd pass "+list.toString());

    }
    public static  int[] getMinTime(int cache_size, int cache_time , int server_time, ArrayList<String> urls){

        int [] time = new int[urls.size()];
        ArrayList<String > cache = new ArrayList<>();
        int i = 0;
        for(String url : urls){

            if(cache.size() == 0){
                cache.add(url);
                time[i] = server_time;
            }else{
                boolean found = false;
                int indx = 0;
                for(String cached: cache){

                    if(cached.equals(url)){
                        time[i] = cache_time;
                        found = true;
                        break;
                    }
                    indx++;
                }
                if(found){
                    cache.remove(indx);
                    cache.add(url);
                }
                else{
                    time[i] = server_time;
                    if(cache.size()== cache_size){
                        cache.remove(0);
                    }
                    cache.add(url);
                }
            }
            i++;
        }
        return time;
    }
}
