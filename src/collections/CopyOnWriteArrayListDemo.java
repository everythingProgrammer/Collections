package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {


    public static void main(String args[]){
        // Copy on write means that where a write operation , like adding or removing an element
        // instead of directly modifying the exitsting list
        // a new copy of the list is created, and the modification is applied to that copy
        // This ensures that other threads reading the list while it's being modified are unaffected.

        // read operations : Fast and Direct
        // write operations : a new copy of the list is created for every modification
        // the reference to the list is then updated so that subsequent reads use this new list


        // generally only used when its a read intensive application

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("MILK");
        shoppingList.add("EGGS");
        shoppingList.add("BREAD");
        System.out.println("Initial Shopping List : "+shoppingList);

        for(String item : shoppingList){
            System.out.println(item);
            if (item.equals("EGGS")) {

                shoppingList.add("Butter");
                System.out.println("ADDED BUTTER WHILE READING ");
                System.out.println(shoppingList);
            }
        }

        System.out.println("Updated Shopping List" + shoppingList);
    }
}
