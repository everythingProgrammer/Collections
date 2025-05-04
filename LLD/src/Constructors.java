public class Constructors {

    public static void main(String[] args) {

        // Scenario 1
/*
        Student s = new Student();


        Student s2 = new Student ("Ankur", "A1");
        // This gives error because it ddoes not have a constructor with 1 parameter
        Student s3 = new Student("Abhinav ");
*/
        // Scenario 2
        Student s = new Student("Ankur", "A1");
        // This gives error because no-args constructor is no longer supplied by compiler
        // default no-args constuctor is only provided in scenario if no other constructor is defined.

        //Student s = new Student();

    }

}


class Student{
    public String name;
    private int age;
    protected double psp;
    String batch ;

// Scenario 1
/*
    Student(){
        name = Null;
        age = 20;
        psp = 50.0;
        batch = "new";
    }
    Student(String xname, String xbatch){
        name = xname;
        batch = xbatch;
    }
*/

    Student(){
        name = null;
        age = 0;
        psp = 0;
        batch = null;
    }

    Student(String xname, String xbatch){
        name = xname;
        batch = xbatch;
    }


    // creating a copy constructor
    // This will create shallow copy. because of String being a class ...
    Student(Student old){
        this.name = old.name;
        this.age = old.age;
        this.psp = old.psp;
        this.batch = old.batch;
    }

}