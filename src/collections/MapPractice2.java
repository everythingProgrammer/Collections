package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


class Person {
    private String name;
    private int id ;

    Person(String name, int id ){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return this.name+"-"+this.id;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass()!= obj.getClass()){
            return false;
        }
        Person other = (Person) obj;
        return id==other.getId() && Objects.equals(name, other.getName());
    }

    public int hashCode(){
        return Objects.hash(name,id);
    }

    public int getId(){return this.id;}
    public String getName(){return this.name;}

}

public class MapPractice2 {

    public static void main(String args[]){

       HashMap<Person, String> map = new HashMap<>();
       Person p1 = new Person("alice",1);
       Person p2 = new Person ("Bob",2);
       Person p3 = new Person ( "alice",1);

        map.put(p1,"Engineer");
        map.put(p2,"Designer");
        map.put(p3,"Manager");

        System.out.println(map);


        Map<String, Integer> map1 = new HashMap<>();
        map1.put(new String("abhinav"),92);
        map1.put(new String ("abhinav"),923);
        System.out.println(map1);


    }

}
