package collections;

import java.util.ArrayList;
import java.util.List;

public class StudentComparator {


    public static void main(String args[]){
        List<Student> students = new ArrayList<>();

        students.add(new Student("student1",12.3));
        students.add(new Student("student2",32.11));
        students.add(new Student("student3",32));
        students.add(new Student("student4",11));
        students.add( new Student("student5",7.21));


        students.sort( (a,b)-> Double.compare(a.getGpa(),b.getGpa()));

        System.out.println(students.toString());
    }
}
