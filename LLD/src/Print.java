/*
Raw Problem

Write a method display such that
We can pass all data-types that supports looping over its data
Write the code to print individual items of the passed data over separate lines
Syntax requirements on display method
display method should be static
display method’s return type should be void
display method will take one parameter of appropriate type that allows it to loop over data
 */


import java.util.Collection;
import java.util.Stack;

public class Print {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        // Make a call to display method as per question requirements here
        display(st);
    }

    // Write the display method as per requirements of question here


    // Static method to display elements of a collection
    public static void display(Collection<?> data) {
        System.out.println("Displaying Collection:");
        for (Object item : data) {
            System.out.println(item);
        }
    }

    // Static method to display elements of an array
    public static <T> void display(T[] data) {
        System.out.println("Displaying Array:");
        for (T item : data) {
            System.out.println(item);
        }
    }

    // Static method to display elements of an Iterable (like a List)
    public static <T extends Iterable<?>> void display(T data) {
        System.out.println("Displaying Iterable:");
        for (Object item : data) {
            System.out.println(item);
        }
    }

}
